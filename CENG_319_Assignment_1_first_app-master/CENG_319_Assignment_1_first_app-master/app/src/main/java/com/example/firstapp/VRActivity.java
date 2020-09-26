package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        //Gets the text view element by id
        TextView tvv = (TextView) findViewById(R.id.changetextt2);
        TextView tv = (TextView) findViewById(R.id.changetextt1);
        TextView textv = (TextView) findViewById(R.id.changetextt);

        //clears the textview
        tvv.setText(" ");

        //main activity label
        textv.setText("VR Activity: \n");
        textv.setTextSize(30);
        textv.setTextColor(Color.MAGENTA);
        textv.setBackgroundColor(Color.GRAY);

        //displays oncreate() sets the tv position, text color, and background color
        tv.setText(getResources().getString(R.string.OnCreate)+"\n");
        tv.setTextSize(30);
        tv.setY(130);
        tv.setTextColor(Color.MAGENTA);
        tv.setBackgroundColor(Color.GRAY);
    }


    @Override
    public void onPause() {
        super.onPause();


        //Gets the text view element by id
        TextView textView = (TextView) findViewById(R.id.changetextt1);
        TextView textVieww = (TextView) findViewById(R.id.changetextt2);

        //clears the textview
        textView.setText(" ");

        //displays onPause()  sets the tv position, text color, and background color
        textVieww.setText(getResources().getString(R.string.OnPause));
        textVieww.setTextSize(30);
        textVieww.setY(130);
        textVieww.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }


    @Override
    public void onStart() {
        super.onStart();

        //Gets the text view element by id
        TextView tvv = (TextView) findViewById(R.id.changetextt2);
        TextView textView=(TextView) findViewById(R.id.changetextt1);

        //clears the textview
        tvv.setText(" ");


        //displays onStart() sets the tv position, text color, and background color
        textView.append(getResources().getString(R.string.OnStart)+"\n");
        textView.setTextSize(30);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }

    @Override
    public void onStop() {
        super.onStop();

        //Gets the text view element by id
        TextView tvv = (TextView) findViewById(R.id.changetextt2);
        TextView textView = (TextView) findViewById(R.id.changetextt1);

        //clears the textview
        tvv.setText(" ");

        //displays onStop() sets the tv position, text color, and background color
        textView.append(getResources().getString(R.string.OnStop)+"\n");
        textView.setTextSize(30);
        textView.setY(130);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        //Gets the text view element by id
        TextView tvv = (TextView) findViewById(R.id.changetextt2);
        TextView textView = (TextView) findViewById(R.id.changetextt1);

        //clears the textview
        tvv.setText(" ");

        //displays onDestroy() sets the tv position, text color, and background color
        textView.setText(getResources().getString(R.string.OnDestroy));
        textView.setTextSize(30);
        textView.setY(130);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }
}