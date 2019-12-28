package ru.mirea.alyoshin.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

    }
    public void onClickAsyncTask(View view) {
        MyAsyncTask myAsyncTask = new MyAsyncTask(resultTextView);
        myAsyncTask.execute();
    }
}
