package com.example.rndroid.alertdialog_practice1;


import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.TimePicker;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimePicker_Fragment extends DialogFragment  {

    public TimePicker_Fragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog d = null;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        int min = calendar.get(java.util.Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                MainActivity m = (MainActivity) getActivity();
                m.catchTime(i,i1);
            }
        }, hour, min, false);
        d = timePickerDialog;

//        return new TimePickerDialog(getActivity(),null , hour, min);

        return d;
    }
}
