package ru.mirea.alyoshin.asynctask;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAsyncTask extends AsyncTask<Void, Integer, Void> {
    String  current;
    Long grad;
    String day;

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private static final String TAG = MyAsyncTask.class.getSimpleName();
    private WeakReference<TextView> wTextView;

    MyAsyncTask(TextView textView) {
        this.wTextView = new WeakReference<>(textView);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        updateText("Запуск");
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        updateText("Выполнено: " + values[0]);
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            int counter = 0;
            for (int i = 0; i < 3; i++) {
                getTime();
                publishProgress(++counter);
            }
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getCurrentTime() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd.MM.yyyy");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }


    public static long getDayEnd(String start, String end) {
        long diff = -1;
        try {
            Date dateStart = simpleDateFormat.parse(start);
            Date dateEnd = simpleDateFormat.parse(end);
            diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
        } catch (Exception e) {

        }
        return diff;
    }
    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        day = getCurrentTime();
        grad = getDayEnd(day, "20.07.2021");
        current = grad.toString();
        updateText("До получения диплома " + current + " дней");
    }

    private void getTime() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }

    private void updateText(String str){
        final TextView textView = wTextView.get();
        if (textView != null) {
            textView.setText(str);
        } else {
            Log.d(TAG, "Что-то пошло не так!");
        }
    }




}

