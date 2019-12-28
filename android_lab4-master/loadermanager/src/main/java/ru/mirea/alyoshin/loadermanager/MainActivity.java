package ru.mirea.alyoshin.loadermanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements
        LoaderManager.LoaderCallbacks<String> {
    public final String TAG = this.getClass().getSimpleName();
    public static final int LOADER_ID = 1;
    private Loader<String> mLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();
        bundle.putString(MyLoader.ARG_WORD, "mirea");
        mLoader = getSupportLoaderManager().initLoader(LOADER_ID, bundle, this);
    }
    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {
        Log.d(TAG, "onLoaderReset");
    }
    @NonNull
    @Override
    public Loader<String> onCreateLoader(int i, @Nullable Bundle bundle) {
        Loader<String> mLoader = null;
        if (i == LOADER_ID) {
            mLoader = new MyLoader(this, bundle);
            Log.d(TAG, "onCreateLoader");
        }
        return mLoader;
    }
    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String s) {
        Log.d(TAG, "onLoadFinished" + s);
    }
}
