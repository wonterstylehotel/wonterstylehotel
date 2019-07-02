package com.wonder.hotel.entity;

public class Recruitment {
    private Integer sSpecialistid;

    private Integer sPoststation;

    private String sRequire;

    private Integer sPeoplenum;

    private String sPhone;

    public Integer getsSpecialistid() {
        return sSpecialistid;
    }

    public void setsSpecialistid(Integer sSpecialistid) {
        this.sSpecialistid = sSpecialistid;
    }

    public Integer getsPoststation() {
        return sPoststation;
    }

    public void setsPoststation(Integer sPoststation) {
        this.sPoststation = sPoststation;
    }

    public String getsRequire() {
        return sRequire;
    }

    public void setsRequire(String sRequire) {
        this.sRequire = sRequire == null ? null : sRequire.trim();
    }

    public Integer getsPeoplenum() {
        return sPeoplenum;
    }

    public void setsPeoplenum(Integer sPeoplenum) {
        this.sPeoplenum = sPeoplenum;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }
}