package com.dazhi.dazhiweeather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/8/24.
 */

public class Suggestion {

    public Comfort comfort;

    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

        public String brf;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

        public String brf;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;

        public String brf;
    }
}
