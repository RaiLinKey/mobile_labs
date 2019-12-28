package ru.mirea.alyoshin.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);

        if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(openLinkIntent);
        } else {
            Log.d("Intent", "Проблема с намерением!");
        }
    }
}
