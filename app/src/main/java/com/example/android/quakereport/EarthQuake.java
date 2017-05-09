package com.example.android.quakereport;



public class Earthquake {

    private long mDate;

    private String mPlace;

    private double mMagnitude;

    private String mUrl;

    public Earthquake(long vDate, String vPlace, double vMagnitude, String vUrl)
    {
        mDate = vDate;
        mPlace = vPlace;
        mMagnitude = vMagnitude;
        mUrl= vUrl;
    }

    public String getmUrl() {
        return mUrl;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }
}