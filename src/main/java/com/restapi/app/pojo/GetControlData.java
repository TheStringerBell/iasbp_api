package com.restapi.app.pojo;



import javax.persistence.*;

@Entity
@Table(name = "Control")
public class GetControlData{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String System;
    private String Status;
    private int Mode;
    private String lowMin;
    private String lowMax;
    private String highMin;
    private String highMax;


    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

    public int getMode() {
        return Mode;
    }

    public void setMode(int mode) {
        Mode = mode;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLowMin() {
        return lowMin;
    }

    public void setLowMin(String lowMin) {
        this.lowMin = lowMin;
    }

    public String getLowMax() {
        return lowMax;
    }

    public void setLowMax(String lowMax) {
        this.lowMax = lowMax;
    }

    public String getHighMin() {
        return highMin;
    }

    public void setHighMin(String highMin) {
        this.highMin = highMin;
    }

    public String getHighMax() {
        return highMax;
    }

    public void setHighMax(String highMax) {
        this.highMax = highMax;
    }
}
