package com.example.kemosabe_x.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    static ListView listView;
    static MovieAdapter mAdapter;
    public static HashMap<String, List<String>> expandableListDetailx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_item);
        final ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.drawable.medical, "Medical Emergency" , "2013"));
        moviesList.add(new Movie(R.drawable.fire, "Fire Emergency" , "2017"));
        moviesList.add(new Movie(R.drawable.criminal, "Criminal Emergency" , "2016"));
        moviesList.add(new Movie(R.drawable.sos1, "Distress calls" , "2014"));
        moviesList.add(new Movie(R.drawable.whistle, "Report / Whistle Blowing" , "2014"));
        moviesList.add(new Movie(R.drawable.capture, "Complaints" , "2014"));
        moviesList.add(new Movie(R.drawable.law, "Legal" , "2014"));

        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Details.class);
                startActivity(intent);


                if (position == 0) {
                    expandableListDetailx = ExpandableListDataPump.getData();
                }
                else if(position == 1){
                    expandableListDetailx = ExpandableListDataPump1.getData();
                }
                else if (position == 2){
                    expandableListDetailx = ExpandableListDataPump2.getData();
                }
                else if(position == 3 ){
                    expandableListDetailx = ExpandableListDataPump3.getData();
                }
                else if(position == 4){
                    expandableListDetailx = ExpandableListDataPump4.getData();

                }
                else if(position == 5){
                    expandableListDetailx = ExpandableListDataPump5.getData();

                }
                else if(position == 6){
                    expandableListDetailx = ExpandableListDataPump6.getData();

                };
            }
        });


    }
}
