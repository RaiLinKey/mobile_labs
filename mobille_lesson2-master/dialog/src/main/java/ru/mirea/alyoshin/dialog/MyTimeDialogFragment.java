package ru.mirea.alyoshin.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.widget.TimePicker;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    int hour;
    int minute;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        OnTimeSetListener myCallBack = new OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                int myHour = hourOfDay;
                int myMinute = minute;

            }
        };
        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(), myCallBack, hour, minute, true);
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int min) {
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTime() {
        String s = getHour() + " hours, " + getMinute() + " minutes.";
        return s;

    }
}
