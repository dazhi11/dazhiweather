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

    public String wind_sc;

    public String wind_spd;

    public String fl;

    public String hum;

    public String pcpn;

    public String vis;
}
