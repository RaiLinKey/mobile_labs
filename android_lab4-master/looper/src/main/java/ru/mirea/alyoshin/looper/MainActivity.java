package ru.mirea.alyoshin.looper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyLooper myLooper;
    EditText editText;
    TextView textView;
//    int myAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText  = (EditText) findViewById(R.id.editText);
        textView  = (TextView) findViewById(R.id.textView);
        myLooper = new MyLooper();
        myLooper.start();

    }
    public void onClick(View view){
        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "mirea");
        msg.setData(bundle);
        if (myLooper != null) {
            myLooper.handler.sendMessage(msg);
        }
    }

    public void btnClick(View view){
        Double myAge = Double.parseDouble(editText.getText().toString());
        Double newAge = myAge + 40;
        textView.setText(newAge.toString());
    }
}
