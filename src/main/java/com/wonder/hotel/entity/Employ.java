package com.wonder.hotel.entity;

public class Employ {
    private Integer eEmployid;

    private String eEmployname;

    private Integer eEmployage;

    private String eEmployphone;

    private Integer eEmploysex;

    private String eEmployfile;

    public Integer geteEmployid() {
        return eEmployid;
    }

    public void seteEmployid(Integer eEmployid) {
        this.eEmployid = eEmployid;
    }

    public String geteEmployname() {
        return eEmployname;
    }

    public void seteEmployname(String eEmployname) {
        this.eEmployname = eEmployname == null ? null : eEmployname.trim();
    }

    public Integer geteEmployage() {
        return eEmployage;
    }

    public void seteEmployage(Integer eEmployage) {
        this.eEmployage = eEmployage;
    }

    public String geteEmployphone() {
        return eEmployphone;
    }

    public void seteEmployphone(String eEmployphone) {
        this.eEmployphone = eEmployphone == null ? null : eEmployphone.trim();
    }

    public Integer geteEmploysex() {
        return eEmploysex;
    }

    public void seteEmploysex(Integer eEmploysex) {
        this.eEmploysex = eEmploysex;
    }

    public String geteEmployfile() {
        return eEmployfile;
    }

    public void seteEmployfile(String eEmployfile) {
        this.eEmployfile = eEmployfile == null ? null : eEmployfile.trim();
    }
}