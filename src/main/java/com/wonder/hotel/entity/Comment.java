package com.wonder.hotel.entity;

import java.util.Date;

public class Comment {
    private Integer cUserid;

    private String cContext;

    private Date cCaretedate;

    private String cPraise;

    public Integer getcUserid() {
        return cUserid;
    }

    public void setcUserid(Integer cUserid) {
        this.cUserid = cUserid;
    }

    public String getcContext() {
        return cContext;
    }

    public void setcContext(String cContext) {
        this.cContext = cContext == null ? null : cContext.trim();
    }

    public Date getcCaretedate() {
        return cCaretedate;
    }

    public void setcCaretedate(Date cCaretedate) {
        this.cCaretedate = cCaretedate;
    }

    public String getcPraise() {
        return cPraise;
    }

    public void setcPraise(String cPraise) {
        this.cPraise = cPraise == null ? null : cPraise.trim();
    }
}