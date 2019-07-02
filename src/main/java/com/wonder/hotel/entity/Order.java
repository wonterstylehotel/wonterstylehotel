package com.wonder.hotel.entity;

import java.util.Date;

public class Order {
    private Integer yuId;

    private Integer ruId;

    private String cuOrderno;

    private Integer cuRommnum;

    private Double cuMoney;

    private Date cuCreationtime;

    public Integer getYuId() {
        return yuId;
    }

    public void setYuId(Integer yuId) {
        this.yuId = yuId;
    }

    public Integer getRuId() {
        return ruId;
    }

    public void setRuId(Integer ruId) {
        this.ruId = ruId;
    }

    public String getCuOrderno() {
        return cuOrderno;
    }

    public void setCuOrderno(String cuOrderno) {
        this.cuOrderno = cuOrderno == null ? null : cuOrderno.trim();
    }

    public Integer getCuRommnum() {
        return cuRommnum;
    }

    public void setCuRommnum(Integer cuRommnum) {
        this.cuRommnum = cuRommnum;
    }

    public Double getCuMoney() {
        return cuMoney;
    }

    public void setCuMoney(Double cuMoney) {
        this.cuMoney = cuMoney;
    }

    public Date getCuCreationtime() {
        return cuCreationtime;
    }

    public void setCuCreationtime(Date cuCreationtime) {
        this.cuCreationtime = cuCreationtime;
    }
}