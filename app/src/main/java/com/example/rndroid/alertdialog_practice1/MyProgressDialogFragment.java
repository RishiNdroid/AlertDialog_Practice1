package com.example.rndroid.alertdialog_practice1;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyProgressDialogFragment extends DialogFragment {

    ProgressDialog progressDialog;
    public MyProgressDialogFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        progressDialog= new ProgressDialog(getActivity());
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("Downloading");
        progressDialog.setMessage("2 of 10 images downloaded");
//        progressDialog.setProgress(20);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        d = progressDialog;
        return d;
    }

    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(20);
    }
}
