package com.sunweater.android.gson;

/**
 * Created by Rsqklc on 2017/3/1.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
