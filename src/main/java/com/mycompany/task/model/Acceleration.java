package com.mycompany.task.model;

import java.util.Date;


public class Acceleration {
    private Long id;
    private Float accelX;
    private Float accelY;
    private Float accelZ;
    private String deviceImei;
    private Date dateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAccelX() {
        return accelX;
    }

    public void setAccelX(Float accelX) {
        this.accelX = accelX;
    }

    public Float getAccelY() {
        return accelY;
    }

    public void setAccelY(Float accelY) {
        this.accelY = accelY;
    }

    public Float getAccelZ() {
        return accelZ;
    }

    public void setAccelZ(Float accelZ) {
        this.accelZ = accelZ;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
}
