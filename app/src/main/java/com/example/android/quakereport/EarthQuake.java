package com.example.android.quakereport;



public class Earthquake {

    private long mDate;

    private String mPlace;

    private double mMagnitude;


    public Earthquake(long vDate, String vPlace, double vMagnitude)
    {
        mDate = vDate;
        mPlace = vPlace;
        mMagnitude = vMagnitude;
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