package com.restapi.app.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class GetControlData{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String Status;
    private String Mode;
    private String lowMin;
    private  String lowMax;
    private String highMin;
    private String highMax;


}
