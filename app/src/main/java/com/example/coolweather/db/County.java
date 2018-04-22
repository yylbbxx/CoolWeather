package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 张彩云 on 2018/4/21.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(String CountyName){
        return CountyName;
    }

    public String getWeatherId(String weatherId){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(int cityId){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}
