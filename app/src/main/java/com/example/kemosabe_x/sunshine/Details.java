package com.example.kemosabe_x.sunshine;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Details extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        expandableListView = findViewById(R.id.expandableListView);
        expandableListDetail = MainActivity.expandableListDetailx;
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());


        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);


        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
/*                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
*/
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
/*                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();
*/

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {


                Intent intent;

                if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "FEDERAL ROAD SAFETY CORPS" ){

                    switch(groupPosition){

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                getApplicationContext(),
                                expandableListTitle.get(groupPosition)
                                        + " -> "
                                        + expandableListDetail.get(
                                        expandableListTitle.get(groupPosition)).get(
                                        childPosition), Toast.LENGTH_SHORT
                        ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "FEDERAL FIRE SERVICE"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654322"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "IGPX SQUAD"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "NAPTIP (ANTI TRAFFICKING)"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC VIOLENCE"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DSVRT"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "HUMAN RIGHTS ORGANIZATION"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "ICPC"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "EFCC (Anti-Corruption)"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC)"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LEGAL AID COUNCIL"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            Toast.makeText(
                                    getApplicationContext(),
                                    expandableListTitle.get(groupPosition)
                                            + " -> "
                                            + expandableListDetail.get(
                                            expandableListTitle.get(groupPosition)).get(
                                            childPosition), Toast.LENGTH_SHORT
                            ).show();
                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0987654321"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else    {}


                return false;
            }
        });
    }


}
