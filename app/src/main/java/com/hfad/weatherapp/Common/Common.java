package com.hfad.weatherapp.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hrant on 2/6/2018.
 */


public class Common {
    public static String API_KEY = "635b5510b204acf9aaab1bfaff29a335";
    public static String API_LINK = "api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}";

    @NonNull
    public static String apRequest(String lat, String lng) {
        StringBuilder sb=new StringBuilder( API_LINK );
        sb.append( String.format( "?lat=%s&lon=%s&APPID=?s&units=metric",lat,lng,API_KEY ) );
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat=new SimpleDateFormat( "HH:mm" );
        Date date=new Date();
        date.setTime( (long)unixTimeStamp*1000 );
        return dateFormat.format( date );
    }

    public static String getImage(String icon){
        return String.format("http//:openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat=new SimpleDateFormat( "dd MMM YYYY HH:mm" );
        Date date=new Date();
        return dateFormat.format( date );
    }
}
