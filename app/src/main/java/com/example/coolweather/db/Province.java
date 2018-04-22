package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 张彩云 on 2018/4/21.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(String provinceName){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(int provinceCode){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
