package edu.sjsu.xuy87.springpetclinic.model;

public class PetType extends BaseEntity{

    private String name;

    public PetType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
