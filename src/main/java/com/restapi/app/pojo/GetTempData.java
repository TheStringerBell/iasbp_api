package com.restapi.app.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Temp")
public class GetTempData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)


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

}
