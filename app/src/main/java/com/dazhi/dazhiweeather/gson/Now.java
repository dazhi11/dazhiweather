package com.dazhi.dazhiweeather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/8/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public String cond_txt;

    public String wind_dir;
}
