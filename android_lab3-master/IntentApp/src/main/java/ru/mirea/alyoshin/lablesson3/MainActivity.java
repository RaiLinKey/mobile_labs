package ru.mirea.alyoshin.lablesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String dateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        dateString = sdf.format(new Date(dateInMillis));
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(dateString);
    }

    public void clickForNewAct(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        textView = (TextView) findViewById(R.id.textView);
        intent.putExtra("key", textView.getText());
        startActivity(intent);
    }
}
