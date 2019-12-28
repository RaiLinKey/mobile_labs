package ru.mirea.alyoshin.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onClickShowTimeDialog(View view) {
        MyTimeDialogFragment timeDialog = new MyTimeDialogFragment();
        timeDialog.show(getSupportFragmentManager(), "dialog");

    }
    public void onClickShowDateDialog(View view){
        MyDateDialogFragment dateDialog = new MyDateDialogFragment();
        dateDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void onClickPD1 (View view)
    {
        MyProgressDialogFragment prDialog = new MyProgressDialogFragment();
        prDialog.show(getSupportFragmentManager(), "dialog");
    }
}
