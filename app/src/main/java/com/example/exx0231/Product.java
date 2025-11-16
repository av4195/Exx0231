package com.example.exx0231;

public class Product {

    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description){
        this.name= name;
        this.description = description;
        this.price= price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
