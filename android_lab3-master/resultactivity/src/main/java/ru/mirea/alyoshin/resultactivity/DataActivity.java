package ru.mirea.alyoshin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        editText = findViewById(R.id.editText);
    }
    public void sendResultOnMainActivityOnClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
