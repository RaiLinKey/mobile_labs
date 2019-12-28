package ru.mirea.alyoshin.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class MyLoader extends AsyncTaskLoader {
    public static final String ARG_WORD = "happy";

    @Nullable
    @Override
    public String loadInBackground() {
        SystemClock.sleep(5000);
        return "5";
    }

    MyLoader(Context context, Bundle bundle) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
