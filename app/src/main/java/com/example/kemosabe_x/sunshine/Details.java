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

                        default:
                            break;
                    }


                }
                // continue Here
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
                        childPosition) == "WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION (DOMESTIC VIOLENCE)"){

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
                        childPosition) == "DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT)"){

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
                else    {

                }


                return false;
            }
        });
    }


}
