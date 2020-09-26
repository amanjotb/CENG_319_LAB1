package com.example.firstapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BottomFragment extends Fragment {


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        //Gets the text view element by id
        TextView tvv = (TextView) view.findViewById(R.id.textbox2);
        TextView tv = (TextView) view.findViewById(R.id.textbox1);
        TextView textv = (TextView) view.findViewById(R.id.label);

        //clears the textview
        tvv.setText(" ");

        //main activity label
        textv.setText("Main Activity: \n");
        textv.setTextSize(30);
        textv.setX(250);
        textv.setY(1200);
        textv.setTextColor(Color.MAGENTA);
        textv.setBackgroundColor(Color.GRAY);

        //displays oncreate() sets the tv position, text color, and background color
        tv.setText(getResources().getString(R.string.OnCreate)+"\n");
        tv.setTextSize(30);
        tv.setX(255);
        tv.setY(1300);
        tv.setTextColor(Color.MAGENTA);
        tv.setBackgroundColor(Color.GRAY);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();


        //Gets the text view element by id
        TextView textView = (TextView) getActivity().findViewById(R.id.textbox1);
        TextView textVieww = (TextView) getActivity().findViewById(R.id.textbox2);

        //clears the textview
        textView.setText(" ");

        //displays onPause()  sets the tv position, text color, and background color
        textVieww.setText(getResources().getString(R.string.OnPause));
        textVieww.setTextSize(30);
        textVieww.setX(250);
        textVieww.setY(1375);
        textVieww.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }


    @Override
    public void onStart() {
        super.onStart();

        //Gets the text view element by id
        TextView tvv = (TextView) getActivity().findViewById(R.id.textbox2);
        TextView textView=(TextView) getActivity().findViewById(R.id.textbox1);

        //clears the textview
        tvv.setText(" ");


        //displays onStart() sets the tv position, text color, and background color
        textView.append(getResources().getString(R.string.OnStart)+"\n");
        textView.setTextSize(30);
        textView.setX(250);
        textView.setY(1375);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }

    @Override
    public void onStop() {
        super.onStop();

        //Gets the text view element by id
        TextView tvv = (TextView) getActivity().findViewById(R.id.textbox2);
        TextView textView = (TextView) getActivity().findViewById(R.id.textbox1);

        //clears the textview
        tvv.setText(" ");

        //displays onStop() sets the tv position, text color, and background color
        textView.append(getResources().getString(R.string.OnStop)+"\n");
        textView.setTextSize(30);
        textView.setX(250);
        textView.setY(1375);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        //Gets the text view element by id
        TextView tvv = (TextView) getActivity().findViewById(R.id.textbox2);
        TextView textView = (TextView) getActivity().findViewById(R.id.textbox1);

        //clears the textview
        tvv.setText(" ");

        //displays onDestroy() sets the tv position, text color, and background color
        textView.setText(getResources().getString(R.string.OnDestroy));
        textView.setTextSize(30);
        textView.setX(250);
        textView.setY(1375);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
    }
}