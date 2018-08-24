package com.dazhi.dazhiweeather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/8/24.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Now now;

    public Suggestion suggestion;

    public Update update;
}
