package com.example.kemosabe_x.sunshine;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fragment_x extends android.support.v4.app.Fragment {

    public ArrayAdapter<String> mList;


    public Fragment_x() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        View rootview = inflater.inflate(R.layout.fragment_x, container, false);
        return rootview;



    }


}
