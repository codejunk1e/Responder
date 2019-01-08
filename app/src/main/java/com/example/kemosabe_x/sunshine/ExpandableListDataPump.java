package com.example.kemosabe_x.sunshine;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import org.w3c.dom.DOMException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();

        final List<String> Medical = new ArrayList<String>();
        Medical.add("FEDERAL ROAD SAFETY CORPS (CALL)");
        Medical.add("FEDERAL ROAD SAFETY CORPS (MESSAGE ONLY)");


        expandableListDetail.put("ABIA STATE", Medical);
        expandableListDetail.put("ADAMAWA STATE", Medical);
        expandableListDetail.put("Akwa Ibom STATE", Medical);
        expandableListDetail.put("Anambra STATE", Medical);
        expandableListDetail.put("Bauchi STATE", Medical);
        expandableListDetail.put("Bayelsa STATE", Medical);
        expandableListDetail.put("Benue STATE", Medical);
        expandableListDetail.put("Borno STATE", Medical);
        expandableListDetail.put("Cross Rivers STATE", Medical);
        expandableListDetail.put("Delta STATE", Medical);
        expandableListDetail.put("Ebonyi STATE", Medical);
        expandableListDetail.put("Edo STATE", Medical);
        expandableListDetail.put("Ekiti STATE", Medical);
        expandableListDetail.put("Enugu STATE", Medical);
        expandableListDetail.put("Gombe STATE", Medical);
        expandableListDetail.put("Imo STATE", Medical);
        expandableListDetail.put("Jigawa STATE", Medical);
        expandableListDetail.put("Kaduna STATE", Medical);
        expandableListDetail.put("Kano STATE", Medical);
        expandableListDetail.put("Katsina STATE", Medical);
        expandableListDetail.put("Kebbi STATE", Medical);
        expandableListDetail.put("Kogi STATE", Medical);
        expandableListDetail.put("Kwara STATE", Medical);
        expandableListDetail.put("Lagos STATE", Medical);
        expandableListDetail.put("Nasarawa STATE", Medical);
        expandableListDetail.put("Niger STATE", Medical);
        expandableListDetail.put("Ogun STATE", Medical);
        expandableListDetail.put("Ondo STATE", Medical);
        expandableListDetail.put("Osun STATE", Medical);
        expandableListDetail.put("Oyo STATE", Medical);
        expandableListDetail.put("Plateau STATE", Medical);
        expandableListDetail.put("Rivers STATE", Medical);
        expandableListDetail.put("Sokoto STATE", Medical);
        expandableListDetail.put("Taraba STATE", Medical);
        expandableListDetail.put("Yobe STATE", Medical);
        expandableListDetail.put("Zamfara TEAMS", Medical);


        return expandableListDetail;

    }

}

class ExpandableListDataPump1 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("FEDERAL FIRE SERVICE");

        final List<String> Xploits1 = new ArrayList<String>();
        Xploits1.add("FEDERAL FIRE SERVICE");
        Xploits1.add("LAGOS STATE FIRE SERVICE (ALAUSA FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (IKEJA FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (ILUPEJU FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (ISOLO FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (EPE FIRE STATION)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (ONIKAN FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (BADAGRY FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (AGEGE FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (IKORODU FIRE)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (SARI-IGANMU)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (IKOTUN/IGANDO)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (LEKKI PHASE I)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (LEKKI PHASE II)");
        Xploits1.add("LAGOS STATE FIRE SERVICE (OJO FIRE STATION)");

        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits1);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}
class ExpandableListDataPump2 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("POLICE DISTRESS NUMBER");
        Xploits.add("IGPX SQUAD");

        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}

class ExpandableListDataPump3 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("POLICE DISTRESS NUMBER");
        Xploits.add("NAPTIP (ANTI TRAFFICKING)");
        Xploits.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION (DOMESTIC VIOLENCE)");
        Xploits.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT)");

        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}


class ExpandableListDataPump4 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("ICPC");
        Xploits.add("EFCC (Anti-Corruption)");


        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}

class ExpandableListDataPump5 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("CONSUMER PROTECTION COUNCIL (CPC)");

        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}
class ExpandableListDataPump6 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("LEGAL AID COUNCIL");



        expandableListDetail.put("ABIA STATE", Xploits);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits);
        expandableListDetail.put("Anambra STATE", Xploits);
        expandableListDetail.put("Bauchi STATE", Xploits);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits);
        expandableListDetail.put("Cross Rivers STATE", Xploits);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits);
        expandableListDetail.put("Edo STATE", Xploits);
        expandableListDetail.put("Ekiti STATE", Xploits);
        expandableListDetail.put("Enugu STATE", Xploits);
        expandableListDetail.put("Gombe STATE", Xploits);
        expandableListDetail.put("Imo STATE", Xploits);
        expandableListDetail.put("Jigawa STATE", Xploits);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits);
        expandableListDetail.put("Kebbi STATE", Xploits);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits);
        expandableListDetail.put("Ondo STATE", Xploits);
        expandableListDetail.put("Osun STATE", Xploits);
        expandableListDetail.put("Oyo STATE", Xploits);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits);
        expandableListDetail.put("Sokoto STATE", Xploits);
        expandableListDetail.put("Taraba STATE", Xploits);
        expandableListDetail.put("Yobe STATE", Xploits);
        expandableListDetail.put("Zamfara TEAMS", Xploits);

        return expandableListDetail;
    }
}
