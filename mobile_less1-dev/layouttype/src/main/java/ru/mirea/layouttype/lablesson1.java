package ru.mirea.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class lablesson1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView4);
        Button button = findViewById(R.id.button10);
        button.setText("wtfcp");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}
