package com.example.mybatislearningCRUD.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Devices {
    private Integer id;
    private Timestamp datetime;
    private String device;
    private int status;
    private int level;
    private double inletpressure;
    private double outletpressure;

    public Devices(Integer id, Timestamp datetime, String device, int status, int level, double inletpressure,
            double outletpressure) {
        this.id = id;
        this.datetime = datetime;
        this.device = device;
        this.status = status;
        this.level = level;
        this.inletpressure = inletpressure;
        this.outletpressure = outletpressure;
    }


    public Devices(){

    }

    @JsonIgnore 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Timestamp getDatetime() {
        return datetime;
    }
    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }
    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public double getInletpressure() {
        return inletpressure;
    }
    public void setInletpressure(double inletpressure) {
        this.inletpressure = inletpressure;
    }
    public double getOutletpressure() {
        return outletpressure;
    }
    public void setOutletpressure(double outletpressure) {
        this.outletpressure = outletpressure;
    }
    
}
