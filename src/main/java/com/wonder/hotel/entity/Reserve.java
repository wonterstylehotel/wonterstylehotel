package com.wonder.hotel.entity;

import java.util.Date;

public class Reserve {
    private Integer yuId;

    private String yuGuestname;

    private Integer yuGerder;

    private String yuCellnumber;

    private Integer yuRoomnum;

    private Date yuCreatltime;

    private Date yuActionltime;

    private Date yuArrivaltime;

    private Double yuPledge;

    private String yuRemake;

    public Integer getYuId() {
        return yuId;
    }

    public void setYuId(Integer yuId) {
        this.yuId = yuId;
    }

    public String getYuGuestname() {
        return yuGuestname;
    }

    public void setYuGuestname(String yuGuestname) {
        this.yuGuestname = yuGuestname == null ? null : yuGuestname.trim();
    }

    public Integer getYuGerder() {
        return yuGerder;
    }

    public void setYuGerder(Integer yuGerder) {
        this.yuGerder = yuGerder;
    }

    public String getYuCellnumber() {
        return yuCellnumber;
    }

    public void setYuCellnumber(String yuCellnumber) {
        this.yuCellnumber = yuCellnumber == null ? null : yuCellnumber.trim();
    }

    public Integer getYuRoomnum() {
        return yuRoomnum;
    }

    public void setYuRoomnum(Integer yuRoomnum) {
        this.yuRoomnum = yuRoomnum;
    }

    public Date getYuCreatltime() {
        return yuCreatltime;
    }

    public void setYuCreatltime(Date yuCreatltime) {
        this.yuCreatltime = yuCreatltime;
    }

    public Date getYuActionltime() {
        return yuActionltime;
    }

    public void setYuActionltime(Date yuActionltime) {
        this.yuActionltime = yuActionltime;
    }

    public Date getYuArrivaltime() {
        return yuArrivaltime;
    }

    public void setYuArrivaltime(Date yuArrivaltime) {
        this.yuArrivaltime = yuArrivaltime;
    }

    public Double getYuPledge() {
        return yuPledge;
    }

    public void setYuPledge(Double yuPledge) {
        this.yuPledge = yuPledge;
    }

    public String getYuRemake() {
        return yuRemake;
    }

    public void setYuRemake(String yuRemake) {
        this.yuRemake = yuRemake == null ? null : yuRemake.trim();
    }
}