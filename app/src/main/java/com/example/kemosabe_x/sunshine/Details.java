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
                        childPosition) == "FEDERAL ROAD SAFETY CORPS (CALL)" ){

                    switch(groupPosition){

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07022553772"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }

                if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "FEDERAL ROAD SAFETY CORPS (MESSAGE ONLY)" ){

                    switch(groupPosition){

                        case 0:

                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("smsto:08077690362"));
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
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003557"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (ALAUSA FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033235891"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (IKEJA FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033219746"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (ILUPEJU FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032265576"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (ISOLO FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08150901982"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (EPE FIRE STATION)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07057259914"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (ONIKAN FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08186404240"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (BADAGRY FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033817515"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (AGEGE FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08185704012"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (IKORODU FIRE)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032220495"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (SARI-IGANMU)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08067026444"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (IKOTUN/IGANDO)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063393240"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (LEKKI PHASE I)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07011555539"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (LEKKI PHASE II)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063393241"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if (expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LAGOS STATE FIRE SERVICE (OJO FIRE STATION)") {

                    switch (groupPosition) {

                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063393242"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER 1"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035415408"));
                            startActivity(intent);


                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08089671313"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08039213071"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07039194332"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08151849417"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07034578208"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08066006475"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08068075581"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08133568456"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08036684974"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07064515001"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08037646272"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08062335577"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003702"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08150567771"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034773600"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391069"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123822284"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032419754"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391255"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08038797644"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391335"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07032069501"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07055462708"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123821571"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08081777498"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032136765"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07034313903"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075872433"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08081768614"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08126375938"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003514"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07068848035"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08140089863"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07039301585"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0810658012"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07057337653"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }



                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER 2"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08079210003"));
                            startActivity(intent);

                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08020913810"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08024922772"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08127162434"));
                            startActivity(intent);
                            break;

                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08053039936"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08036071667"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07053355415"));
                            startActivity(intent);
                            break;

                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08125273721"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08077773721"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07089310359"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075390883"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08151855014"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08037037283"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07089846285"));
                            startActivity(intent);
                            break;

                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123821575"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391250"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391307"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07038329084"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08125275046"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035963919"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07075391560"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08127185198"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08081770416"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08081770416"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08039537995"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08150777888"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391844"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08073777717"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075391943"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08073260267"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035067570"));
                            startActivity(intent);
                            break;
                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08061581938"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }


                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER 3"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08079210004"));
                            startActivity(intent);


                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08075390511"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08084763669"));
                            startActivity(intent);
                            break;

                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07075390677"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123823322"));
                            startActivity(intent);
                            break;

                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08084704673"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08067551618"));
                            startActivity(intent);
                            break;

                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08086671202"));
                            startActivity(intent);
                            break;

                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123821598"));
                            startActivity(intent);
                            break;

                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08064977004"));
                            startActivity(intent);
                            break;

                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08123823981"));
                            startActivity(intent);
                            break;

                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08038907662"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032003913"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }


                }


                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "POLICE DISTRESS NUMBER 4"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08079210005"));
                            startActivity(intent);


                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08182951257"));
                            startActivity(intent);

                            break;

                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08073794920"));
                            startActivity(intent);
                            break;

                            // fuck This shit up
                        default:
                            break;
                    }


                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "IGPX SQUAD 1"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:09026900726"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "IGPX SQUAD 2"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08078662130"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601804"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07088698165"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601806"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601802"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601803"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601800"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601801"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07080601805"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07030000203"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08188699961"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08172125692"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07063807887"));
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08085754226"));
                    startActivity(intent);
                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:07032165181"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08137960048"));
                    startActivity(intent);

                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM LAGOS 1"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08056268573"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM LAGOS 2"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:07080601080"));
                    startActivity(intent);

                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) I"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08022554272"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) II"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08031230280"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) III"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08031230281"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) IV"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:07056990190"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) V"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:07056990191"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) I"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08099044751"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) II"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08099044752"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) III"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08099044753"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) IV"){
                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08093322644"));
                    startActivity(intent);

                }
                // continue here
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) NORTH CENTRAL"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08147170734"));
                    startActivity(intent);

                }

                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) NORTH EAST"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08147170735"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) NORTH WEST"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08163196314"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) SOUTH EAST"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08034124060"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) SOUTH SOUTH"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08147170732"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) SOUTH WEST"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08147170733"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) KANO STATE"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08148007378"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "CONSUMER PROTECTION COUNCIL (CPC) LAGOS STATE"){

                    intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:08147170730"));
                    startActivity(intent);

                }
                else if(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(
                        childPosition) == "LEGAL AID COUNCIL"){

                    switch(groupPosition) {

                        case 0:

                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032889382"));
                            startActivity(intent);

                            break;

                        case 1:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08036341640"));
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08052231092"));
                            startActivity(intent);

                            break;
                        case 3:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033459707"));
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08056168357"));
                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08032870008"));
                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08039650978"));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08167155022"));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08053363287"));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08029426828"));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035059290"));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035754605"));
                            startActivity(intent);
                            break;
                        case 12:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08028287561"));
                            startActivity(intent);
                            break;
                        case 13:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034537752"));
                            startActivity(intent);
                            break;
                        case 14:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08058615087"));
                            startActivity(intent);
                            break;
                        case 15:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08063079364"));
                            startActivity(intent);
                            break;
                        case 16:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08183221224"));
                            startActivity(intent);
                            break;
                        case 17:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08030921543"));
                            startActivity(intent);
                            break;
                        case 18:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08054374225"));
                            startActivity(intent);
                            break;
                        case 19:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08023500657"));
                            startActivity(intent);
                            break;
                        case 20:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08099131416"));
                            startActivity(intent);
                            break;
                        case 21:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08124449741"));
                            startActivity(intent);
                            break;
                        case 22:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034838318"));
                            startActivity(intent);
                            break;
                        case 23:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08023154578"));
                            startActivity(intent);
                            break;
                        case 24:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08055083960"));
                            startActivity(intent);
                            break;
                        case 25:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:07068875605"));
                            startActivity(intent);
                            break;
                        case 26:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033823631"));
                            startActivity(intent);
                            break;
                        case 27:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08029514412"));
                            startActivity(intent);
                            break;
                        case 28:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034175847"));
                            startActivity(intent);
                            break;
                        case 29:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08057072560"));
                            startActivity(intent);
                            break;
                        case 30:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08035946711"));
                            startActivity(intent);
                            break;
                        case 31:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033395471"));
                            startActivity(intent);
                            break;
                        case 32:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034526260"));
                            startActivity(intent);
                            break;
                        case 33:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08033928429"));
                            startActivity(intent);
                            break;
                        case 34:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08034175847"));
                            startActivity(intent);
                            break;
                        case 35:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08026164604"));
                            startActivity(intent);
                            break;

                        case 36:
                            intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:08039697287"));
                            startActivity(intent);
                            break;


                        default:
                            break;
                    }

                }
                else    {

                }


                return false;
            }
        });
    }


}
