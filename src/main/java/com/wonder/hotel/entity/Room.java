package com.wonder.hotel.entity;

public class Room {
    private Integer rId;

    private Integer rRoomnum;

    private Integer rTypeid;

    private Integer rStatus;

    private Double rRegularprice;

    private Double rMemberprice;

    private String rPhoto;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getrRoomnum() {
        return rRoomnum;
    }

    public void setrRoomnum(Integer rRoomnum) {
        this.rRoomnum = rRoomnum;
    }

    public Integer getrTypeid() {
        return rTypeid;
    }

    public void setrTypeid(Integer rTypeid) {
        this.rTypeid = rTypeid;
    }

    public Integer getrStatus() {
        return rStatus;
    }

    public void setrStatus(Integer rStatus) {
        this.rStatus = rStatus;
    }

    public Double getrRegularprice() {
        return rRegularprice;
    }

    public void setrRegularprice(Double rRegularprice) {
        this.rRegularprice = rRegularprice;
    }

    public Double getrMemberprice() {
        return rMemberprice;
    }

    public void setrMemberprice(Double rMemberprice) {
        this.rMemberprice = rMemberprice;
    }

    public String getrPhoto() {
        return rPhoto;
    }

    public void setrPhoto(String rPhoto) {
        this.rPhoto = rPhoto == null ? null : rPhoto.trim();
    }
}