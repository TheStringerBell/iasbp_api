package com.restapi.app.pojo;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class GetHumiData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String Date;
    private String Time;
    private String Value;
    public String getDate(){
        return Date;
    }
    public String getTime(){
        return Time;
    }
    public String getValue(){
        return Value;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public void setTime(String Time) {
        this.Time = Time;
    }
    public void setValue(String Value) {
        this.Value = Value;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
