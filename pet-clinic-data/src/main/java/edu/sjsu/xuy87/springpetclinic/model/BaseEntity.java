package edu.sjsu.xuy87.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
