package com.example.android.quakereport;

public class Earthquakes {

    private String mPlace;

    private double mMagnitude;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquakes(double magnitude, String place, long timeInMilliseconds, String url) {
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mMagnitude = magnitude;
        mUrl = url;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl() {
        return mUrl;
    }
}
