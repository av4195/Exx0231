package com.example.exx0231;

public class Book extends Product{
    private int numPage;


    public Book(String name, int price, String description, int numPage){
        super(name, price, description);
        this.numPage = numPage;
    }

    public int getNumPage(){
        return this.numPage;
    }

    public void setNumPage(int numPage){
        this.numPage = numPage;
    }

    public String getName(){
        return super.getName();
    }

    public int getPrice(){
        return super.getPrice();
    }

    public String getDescription(){
        return super.getDescription();
    }

    public void setName(String name){
        super.setName(name);
    }

    public void setPrice(int price){
        super.setPrice(price);
    }

    public void setDescription(String description){
        super.setDescription(description);
    }
}
