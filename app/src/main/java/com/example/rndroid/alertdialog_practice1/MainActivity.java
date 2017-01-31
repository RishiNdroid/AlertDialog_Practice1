package com.example.rndroid.alertdialog_practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button, button2,button3,button4;
    TextView textView, textView2;

    public void catchData(int i, int i1, int i2){
        textView.setText("Date : "+i+"/"+i1+1+"/"+i2);
    }

    public void catchTime(int i, int i1){
        textView2.setText("Time : "+i+":"+i1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        textView = (TextView) findViewById(R.id.textview);
        textView2 = (TextView) findViewById(R.id.textview2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialogFragment m = new MyDialogFragment();
                m.show(getSupportFragmentManager(),null);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyProgressDialogFragment m = new MyProgressDialogFragment();
                m.show(getSupportFragmentManager(),null);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method 1
//                DatePickerFragment m = new DatePickerFragment();
//                m.show(getSupportFragmentManager(),null);
                //Method 2
                DatePicker_Method2Fragment datePickerMethod2Fragment = new DatePicker_Method2Fragment();
                datePickerMethod2Fragment.show(getSupportFragmentManager(), null);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyCustom_DialogFragment myCustom_dialogFragment = new MyCustom_DialogFragment();
                myCustom_dialogFragment.show(getSupportFragmentManager(),null);
            }
        });

    }
}
