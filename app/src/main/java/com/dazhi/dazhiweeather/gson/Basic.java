package com.dazhi.dazhiweeather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/8/24.
 */

public class Basic {

    @SerializedName("city")
    private String cityName;

    @SerializedName("id")
    private String weatherId;
}
