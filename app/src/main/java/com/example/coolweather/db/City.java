package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 张彩云 on 2018/4/21.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(String cityName){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(int cityCode){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(int provinceId){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
