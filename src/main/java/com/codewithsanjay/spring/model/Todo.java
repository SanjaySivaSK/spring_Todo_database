package com.codewithsanjay.spring.model;

public class Todo {
    private int ID;
    private String NAME;
    private String GENDER;

    public int getID() {
        return ID;
    }

    public String getGENDER() {
        return GENDER;
    }

    public Todo() {
    }

    public Todo(int ID, String NAME, String GENDER) {
        this.ID = ID;
        this.NAME = NAME;
        this.GENDER = GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }


}
