package com.restapi.app.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "insSensValue")
public class GetInsideData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private String Value;


    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }


}
