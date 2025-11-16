package com.example.exx0231;

public class Clothing extends Product{
    private String type;

    public Clothing(String name, double price, String description, String type){
        super(name, price, description);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return super.getName();
    }
    public double getPrice(){
        return super.getPrice();
    }
    public String getDescription(){
        return super.getDescription();
    }


    public void setName(String name){
        super.setName(name);
    }
    public void setPrice(double price){
        super.setPrice(price);
    }
    public void setDescription(String description){
        super.setDescription(description);
    }
}
