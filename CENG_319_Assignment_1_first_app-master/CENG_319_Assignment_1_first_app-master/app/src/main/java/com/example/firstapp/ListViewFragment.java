package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.Instant;

public class ListViewFragment extends Fragment {



    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final Toast message = null;

        View v =  inflater.inflate(R.layout.fragment_list_view, container, false);

        String [] mainmenuOption = {"AI Activity", "VR Activity"};
        ListView menu = (ListView) v.findViewById(R.id.listmenuview);

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,
                                                                        mainmenuOption);
        menu.setAdapter(ListViewAdapter);

        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    message.makeText(getActivity(), "AI Activity option",
                                     Toast.LENGTH_LONG).show();
                    Intent aiActivityy = new Intent(getActivity(), AIActivity.class);
                    startActivity(aiActivityy);
                }
                if (position == 1){
                    message.makeText(getActivity(), "VR Activity option",
                                     Toast.LENGTH_LONG).show();
                    Intent vrActivityy = new Intent(getActivity(), VRActivity.class);
                    startActivity(vrActivityy);
                }
            }
        });

        return v;
    }
}