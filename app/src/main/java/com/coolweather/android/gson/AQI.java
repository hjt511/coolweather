package com.coolweather.android.gson;

/**
 * Created by hjt on 2017/3/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
