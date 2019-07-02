package com.wonder.hotel.entity;

public class Member {
    private Integer hId;

    private String hCardno;

    private String hUserpassword;

    private Integer hUserid;

    private String hIntegral;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethCardno() {
        return hCardno;
    }

    public void sethCardno(String hCardno) {
        this.hCardno = hCardno == null ? null : hCardno.trim();
    }

    public String gethUserpassword() {
        return hUserpassword;
    }

    public void sethUserpassword(String hUserpassword) {
        this.hUserpassword = hUserpassword == null ? null : hUserpassword.trim();
    }

    public Integer gethUserid() {
        return hUserid;
    }

    public void sethUserid(Integer hUserid) {
        this.hUserid = hUserid;
    }

    public String gethIntegral() {
        return hIntegral;
    }

    public void sethIntegral(String hIntegral) {
        this.hIntegral = hIntegral == null ? null : hIntegral.trim();
    }
}