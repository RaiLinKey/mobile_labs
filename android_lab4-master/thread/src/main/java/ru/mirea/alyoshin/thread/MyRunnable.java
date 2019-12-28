package ru.mirea.alyoshin.thread;

import android.util.Log;

public class MyRunnable implements Runnable {
    private static final String TAG = MyRunnable.class.getSimpleName();
    private String goal;
    public MyRunnable(String goal) {
        this.goal=goal;
    }
    @Override
    public void run() {
        Log.d(TAG, "Среднее количество пар за день:" + goal);
    }
}
