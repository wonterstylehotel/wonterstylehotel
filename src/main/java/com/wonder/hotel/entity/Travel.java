package com.wonder.hotel.entity;

public class Travel {
    private Integer tTravelid;

    private String tTravelname;

    private Integer tTraveltickes;

    private Double tTravelprice;

    private String tTravelphoto;

    private String tTraveldescribe;

    public Integer gettTravelid() {
        return tTravelid;
    }

    public void settTravelid(Integer tTravelid) {
        this.tTravelid = tTravelid;
    }

    public String gettTravelname() {
        return tTravelname;
    }

    public void settTravelname(String tTravelname) {
        this.tTravelname = tTravelname == null ? null : tTravelname.trim();
    }

    public Integer gettTraveltickes() {
        return tTraveltickes;
    }

    public void settTraveltickes(Integer tTraveltickes) {
        this.tTraveltickes = tTraveltickes;
    }

    public Double gettTravelprice() {
        return tTravelprice;
    }

    public void settTravelprice(Double tTravelprice) {
        this.tTravelprice = tTravelprice;
    }

    public String gettTravelphoto() {
        return tTravelphoto;
    }

    public void settTravelphoto(String tTravelphoto) {
        this.tTravelphoto = tTravelphoto == null ? null : tTravelphoto.trim();
    }

    public String gettTraveldescribe() {
        return tTraveldescribe;
    }

    public void settTraveldescribe(String tTraveldescribe) {
        this.tTraveldescribe = tTraveldescribe == null ? null : tTraveldescribe.trim();
    }
}