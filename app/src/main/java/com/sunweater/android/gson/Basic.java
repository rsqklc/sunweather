package com.sunweater.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rsqklc on 2017/3/1.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
