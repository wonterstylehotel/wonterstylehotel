package com.wonder.hotel.entity;

public class Checking {
    private Integer ruId;

    private String ruGuestname;

    private Integer ruGerder;

    private String ruIdcarsno;

    private String ruRoomnum;

    private String ruCheckintime;

    private String ruLeavetime;

    public Integer getRuId() {
        return ruId;
    }

    public void setRuId(Integer ruId) {
        this.ruId = ruId;
    }

    public String getRuGuestname() {
        return ruGuestname;
    }

    public void setRuGuestname(String ruGuestname) {
        this.ruGuestname = ruGuestname == null ? null : ruGuestname.trim();
    }

    public Integer getRuGerder() {
        return ruGerder;
    }

    public void setRuGerder(Integer ruGerder) {
        this.ruGerder = ruGerder;
    }

    public String getRuIdcarsno() {
        return ruIdcarsno;
    }

    public void setRuIdcarsno(String ruIdcarsno) {
        this.ruIdcarsno = ruIdcarsno == null ? null : ruIdcarsno.trim();
    }

    public String getRuRoomnum() {
        return ruRoomnum;
    }

    public void setRuRoomnum(String ruRoomnum) {
        this.ruRoomnum = ruRoomnum == null ? null : ruRoomnum.trim();
    }

    public String getRuCheckintime() {
        return ruCheckintime;
    }

    public void setRuCheckintime(String ruCheckintime) {
        this.ruCheckintime = ruCheckintime == null ? null : ruCheckintime.trim();
    }

    public String getRuLeavetime() {
        return ruLeavetime;
    }

    public void setRuLeavetime(String ruLeavetime) {
        this.ruLeavetime = ruLeavetime == null ? null : ruLeavetime.trim();
    }
}