package com.technical.crud.models;

public class User {
    private int id;
    private String name;

    public User(int id,String name){
        this.id=id;
        this.name=name;

    }
    public User(){

    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    

}
