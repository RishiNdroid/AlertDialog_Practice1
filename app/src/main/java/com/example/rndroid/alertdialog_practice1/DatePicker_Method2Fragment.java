package com.example.rndroid.alertdialog_practice1;


import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.DatePicker;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePicker_Method2Fragment extends DialogFragment{


    public DatePicker_Method2Fragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog d = null;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int year = calendar.get(java.util.Calendar.YEAR);
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int month = calendar.get(java.util.Calendar.MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
//                Toast.makeText(getActivity(), ""+i+"/"+i1+"/"+i2, Toast.LENGTH_SHORT).show();
                MainActivity m = (MainActivity) getActivity();
                m.catchData(i,i1,i2);
            }
        }, year, month, day);
        d = datePickerDialog;
        return d;
    }
}
