package com.example.exx0231;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, double price, String description, String brand){
        super(name, price, description);
        this.brand = brand;
    }



    public String  getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
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
