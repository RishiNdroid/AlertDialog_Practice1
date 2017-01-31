package com.example.rndroid.alertdialog_practice1;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyCustom_DialogFragment extends DialogFragment {


    public MyCustom_DialogFragment() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Gmail");

        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_my_custom__dialog,null);
        final EditText ed1 = (EditText) v.findViewById(R.id.ed1);
        final EditText ed2 = (EditText) v.findViewById(R.id.ed2);
        CheckBox checkBox = (CheckBox) v.findViewById(R.id.checkbox1);

        builder.setView(v);

        builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), ""+ed1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("LogOut", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), ""+ed2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        dialog = builder.create();
        return dialog;
    }
}
