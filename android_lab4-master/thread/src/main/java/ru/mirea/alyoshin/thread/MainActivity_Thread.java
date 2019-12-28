package ru.mirea.alyoshin.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity_Thread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__thread);
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        Thread mainThread = Thread.currentThread();
        infoTextView.setText("Текущий поток: " + mainThread.getName());
// Меняем имя и выводим в текстовом поле
        mainThread.setName("MireaThread");
        infoTextView.append("\nНовое имя потока: " + mainThread.getName());
    }

    public void onClick(View view) {
        MyThread myThread = new MyThread();
        myThread.start();
        Integer result = 60/24;
        MyRunnable runnable = new MyRunnable(result.toString());
        new Thread(runnable).start();
    }
}
