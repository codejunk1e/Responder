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
        expandableListDetail.put("Zamfara STATE", Medical);
        expandableListDetail.put("Abuja FCT", Medical);


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
        expandableListDetail.put("Zamfara STATE", Xploits);
        expandableListDetail.put("Abuja FCT ", Xploits);

        return expandableListDetail;
    }
}
class ExpandableListDataPump2 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("POLICE DISTRESS NUMBER 1");
        Xploits.add("IGPX SQUAD 1");
        Xploits.add("IGPX SQUAD 2");



        final List<String> Xploits1 = new ArrayList<String>();
        Xploits1.add("POLICE DISTRESS NUMBER 1");
        Xploits1.add("POLICE DISTRESS NUMBER 2");
        Xploits1.add("IGPX SQUAD 1");
        Xploits1.add("IGPX SQUAD 2");


        final List<String> Xploits2 = new ArrayList<String>();
        Xploits2.add("POLICE DISTRESS NUMBER 1");
        Xploits2.add("POLICE DISTRESS NUMBER 2");
        Xploits2.add("POLICE DISTRESS NUMBER 3");
        Xploits2.add("IGPX SQUAD 1");
        Xploits2.add("IGPX SQUAD 2");

        final List<String> Xploits3 = new ArrayList<String>();
        Xploits3.add("POLICE DISTRESS NUMBER 1");
        Xploits3.add("POLICE DISTRESS NUMBER 2");
        Xploits3.add("POLICE DISTRESS NUMBER 3");
        Xploits3.add("POLICE DISTRESS NUMBER 4");
        Xploits3.add("IGPX SQUAD 1");
        Xploits3.add("IGPX SQUAD 2");



        expandableListDetail.put("ABIA STATE", Xploits3);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits1);
        expandableListDetail.put("Anambra STATE", Xploits3);
        expandableListDetail.put("Bauchi STATE", Xploits3);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits2);
        expandableListDetail.put("Borno STATE", Xploits2);
        expandableListDetail.put("Cross Rivers STATE", Xploits1);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits2);
        expandableListDetail.put("Edo STATE", Xploits2);
        expandableListDetail.put("Ekiti STATE", Xploits1);
        expandableListDetail.put("Enugu STATE", Xploits2);
        expandableListDetail.put("Gombe STATE", Xploits1);
        expandableListDetail.put("Imo STATE", Xploits1);
        expandableListDetail.put("Jigawa STATE", Xploits2);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits1);
        expandableListDetail.put("Kebbi STATE", Xploits1);
        expandableListDetail.put("Kogi STATE", Xploits1);
        expandableListDetail.put("Kwara STATE", Xploits1);
        expandableListDetail.put("Lagos STATE", Xploits1);
        expandableListDetail.put("Nasarawa STATE", Xploits1);
        expandableListDetail.put("Niger STATE", Xploits1);
        expandableListDetail.put("Ogun STATE", Xploits1);
        expandableListDetail.put("Ondo STATE", Xploits1);
        expandableListDetail.put("Osun STATE", Xploits2);
        expandableListDetail.put("Oyo STATE", Xploits1);
        expandableListDetail.put("Plateau STATE", Xploits2);
        expandableListDetail.put("Rivers STATE", Xploits1);
        expandableListDetail.put("Sokoto STATE", Xploits1);
        expandableListDetail.put("Taraba STATE", Xploits1);
        expandableListDetail.put("Yobe STATE", Xploits1);
        expandableListDetail.put("Zamfara TEAMS", Xploits);
        expandableListDetail.put("Abuja FCT ", Xploits2);
        return expandableListDetail;
    }
}

class ExpandableListDataPump3 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("POLICE DISTRESS NUMBER 1");
        Xploits.add("NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)");
        Xploits.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1");
        Xploits.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2");
        Xploits.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3");
        Xploits.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1");
        Xploits.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2");
        Xploits.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3");

        final List<String> Xploits1 = new ArrayList<String>();
        Xploits1.add("POLICE DISTRESS NUMBER 1");
        Xploits1.add("POLICE DISTRESS NUMBER 2");
        Xploits1.add("NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)");
        Xploits1.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1");
        Xploits1.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2");
        Xploits1.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3");
        Xploits1.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1");
        Xploits1.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2");
        Xploits1.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3");

        final List<String> Xploits2 = new ArrayList<String>();
        Xploits2.add("POLICE DISTRESS NUMBER 1");
        Xploits2.add("POLICE DISTRESS NUMBER 2");
        Xploits2.add("POLICE DISTRESS NUMBER 3");
        Xploits2.add("NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)");
        Xploits2.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1");
        Xploits2.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2");
        Xploits2.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3");
        Xploits2.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1");
        Xploits2.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2");
        Xploits2.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3");

        final List<String> Xploits3 = new ArrayList<String>();
        Xploits3.add("POLICE DISTRESS NUMBER 1");
        Xploits3.add("POLICE DISTRESS NUMBER 2");
        Xploits3.add("POLICE DISTRESS NUMBER 3");
        Xploits3.add("POLICE DISTRESS NUMBER 4");
        Xploits3.add("NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)");
        Xploits3.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1");
        Xploits3.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2");
        Xploits3.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3");
        Xploits3.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1");
        Xploits3.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2");
        Xploits3.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3");

        final List<String> Xploits_Lagos = new ArrayList<String>();
        Xploits_Lagos.add("POLICE DISTRESS NUMBER 1");
        Xploits_Lagos.add("POLICE DISTRESS NUMBER 2");
        Xploits_Lagos.add("NAPTIP (NATIONAL AGENCY FOR PROHIBITION OF TRAFFICKING IN PERSONS)");
        Xploits_Lagos.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 1");
        Xploits_Lagos.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 2");
        Xploits_Lagos.add("WOMEN’S RIGHTS ADVANCEMENT AND PROTECTION ALTERNATIVE (WRAPA) (DOMESTIC VIOLENCE) 3");
        Xploits_Lagos.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 1");
        Xploits_Lagos.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 2");
        Xploits_Lagos.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM (DSVRT) 3");
        Xploits_Lagos.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM LAGOS 1");
        Xploits_Lagos.add("DOMESTIC AND SEXUAL VIOLENCE RESPONSE TEAM LAGOS 2");


        expandableListDetail.put("ABIA STATE", Xploits3);
        expandableListDetail.put("ADAMAWA STATE", Xploits);
        expandableListDetail.put("Akwa Ibom STATE", Xploits1);
        expandableListDetail.put("Anambra STATE", Xploits3);
        expandableListDetail.put("Bauchi STATE", Xploits3);
        expandableListDetail.put("Bayelsa STATE", Xploits);
        expandableListDetail.put("Benue STATE", Xploits2);
        expandableListDetail.put("Borno STATE", Xploits2);
        expandableListDetail.put("Cross Rivers STATE", Xploits1);
        expandableListDetail.put("Delta STATE", Xploits);
        expandableListDetail.put("Ebonyi STATE", Xploits2);
        expandableListDetail.put("Edo STATE", Xploits2);
        expandableListDetail.put("Ekiti STATE", Xploits1);
        expandableListDetail.put("Enugu STATE", Xploits2);
        expandableListDetail.put("Gombe STATE", Xploits1);
        expandableListDetail.put("Imo STATE", Xploits1);
        expandableListDetail.put("Jigawa STATE", Xploits2);
        expandableListDetail.put("Kaduna STATE", Xploits);
        expandableListDetail.put("Kano STATE", Xploits);
        expandableListDetail.put("Katsina STATE", Xploits1);
        expandableListDetail.put("Kebbi STATE", Xploits1);
        expandableListDetail.put("Kogi STATE", Xploits1);
        expandableListDetail.put("Kwara STATE", Xploits1);
        expandableListDetail.put("Lagos STATE", Xploits_Lagos);
        expandableListDetail.put("Nasarawa STATE", Xploits1);
        expandableListDetail.put("Niger STATE", Xploits1);
        expandableListDetail.put("Ogun STATE", Xploits1);
        expandableListDetail.put("Ondo STATE", Xploits1);
        expandableListDetail.put("Osun STATE", Xploits2);
        expandableListDetail.put("Oyo STATE", Xploits1);
        expandableListDetail.put("Plateau STATE", Xploits2);
        expandableListDetail.put("Rivers STATE", Xploits1);
        expandableListDetail.put("Sokoto STATE", Xploits1);
        expandableListDetail.put("Taraba STATE", Xploits1);
        expandableListDetail.put("Yobe STATE", Xploits1);
        expandableListDetail.put("Zamfara TEAMS", Xploits);
        expandableListDetail.put("Abuja FCT ", Xploits2);

        return expandableListDetail;
    }
}


class ExpandableListDataPump4 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) I");
        Xploits.add("INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) II");
        Xploits.add("INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) III");
        Xploits.add("INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) IV");
        Xploits.add("INDEPENDENT CORRUPT PRACTICES COMMISSION ICPC (ANTI-CORRUPTION) V");
        Xploits.add("ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) I");
        Xploits.add("ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) II");
        Xploits.add("ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) III");
        Xploits.add("ECONOMIC AND FINANCIAL CRIMES COMMISSION EFCC (ANTI-CORRUPTION) IV");


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
        expandableListDetail.put("Abuja FCT ", Xploits);

        return expandableListDetail;
    }
}

class ExpandableListDataPump5 {


    public static LinkedHashMap<String, List<String>> getData() {
        final LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();


        final List<String> Xploits = new ArrayList<String>();
        Xploits.add("CONSUMER PROTECTION COUNCIL (CPC) NORTH CENTRAL ZONE");

        final List<String> Xploits1 = new ArrayList<String>();
        Xploits1.add("CONSUMER PROTECTION COUNCIL (CPC) NORTH EAST ZONE");

        final List<String> Xploits2 = new ArrayList<String>();
        Xploits2.add("CONSUMER PROTECTION COUNCIL (CPC) NORTH WEST ZONE");

        final List<String> Xploits3 = new ArrayList<String>();
        Xploits3.add("CONSUMER PROTECTION COUNCIL (CPC) SOUTH EAST ZONE");

        final List<String> Xploits4 = new ArrayList<String>();
        Xploits4.add("CONSUMER PROTECTION COUNCIL (CPC) SOUTH SOUTH ZONE");

        final List<String> Xploits5 = new ArrayList<String>();
        Xploits5.add("CONSUMER PROTECTION COUNCIL (CPC) SOUTH WEST ZONE");

        final List<String> Xploits6 = new ArrayList<String>();
        Xploits6.add("CONSUMER PROTECTION COUNCIL (CPC) SOUTH WEST ZONE");
        Xploits6.add("CONSUMER PROTECTION COUNCIL (CPC) LAGOS STATE ZONE");

        final List<String> Xploits7 = new ArrayList<String>();
        Xploits7.add("CONSUMER PROTECTION COUNCIL (CPC) NORTH WEST ZONE");
        Xploits7.add("CONSUMER PROTECTION COUNCIL (CPC) KANO STATE ZONE");

        expandableListDetail.put("ABIA STATE", Xploits3);
        expandableListDetail.put("ADAMAWA STATE", Xploits1);
        expandableListDetail.put("Akwa Ibom STATE", Xploits4);
        expandableListDetail.put("Anambra STATE", Xploits3);
        expandableListDetail.put("Bauchi STATE", Xploits1);
        expandableListDetail.put("Bayelsa STATE", Xploits4);
        expandableListDetail.put("Benue STATE", Xploits);
        expandableListDetail.put("Borno STATE", Xploits1);
        expandableListDetail.put("Cross Rivers STATE", Xploits4);
        expandableListDetail.put("Delta STATE", Xploits4);
        expandableListDetail.put("Ebonyi STATE", Xploits3);
        expandableListDetail.put("Edo STATE", Xploits4);
        expandableListDetail.put("Ekiti STATE", Xploits5);
        expandableListDetail.put("Enugu STATE", Xploits3);
        expandableListDetail.put("Gombe STATE", Xploits1);
        expandableListDetail.put("Imo STATE", Xploits3);
        expandableListDetail.put("Jigawa STATE", Xploits2);
        expandableListDetail.put("Kaduna STATE", Xploits2);
        expandableListDetail.put("Kano STATE", Xploits7);
        expandableListDetail.put("Katsina STATE", Xploits2);
        expandableListDetail.put("Kebbi STATE", Xploits2);
        expandableListDetail.put("Kogi STATE", Xploits);
        expandableListDetail.put("Kwara STATE", Xploits);
        expandableListDetail.put("Lagos STATE", Xploits6);
        expandableListDetail.put("Nasarawa STATE", Xploits);
        expandableListDetail.put("Niger STATE", Xploits);
        expandableListDetail.put("Ogun STATE", Xploits5);
        expandableListDetail.put("Ondo STATE", Xploits5);
        expandableListDetail.put("Osun STATE", Xploits5);
        expandableListDetail.put("Oyo STATE", Xploits5);
        expandableListDetail.put("Plateau STATE", Xploits);
        expandableListDetail.put("Rivers STATE", Xploits4);
        expandableListDetail.put("Sokoto STATE", Xploits2);
        expandableListDetail.put("Taraba STATE", Xploits1);
        expandableListDetail.put("Yobe STATE", Xploits1);
        expandableListDetail.put("Zamfara TEAMS", Xploits2);
        expandableListDetail.put("Abuja FCT ", Xploits);

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
        expandableListDetail.put("Abuja FCT ", Xploits);

        return expandableListDetail;
    }
}
