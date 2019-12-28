package ru.mirea.alyoshin.lablesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String) getIntent().getSerializableExtra("key");
        textView2 = findViewById(R.id.textView2);
        textView2.setText(text);
    }
}
