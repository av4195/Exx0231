package com.example.exx0231;

public class ShoppingCart {
    private Product[] products;

    public ShoppingCart(Product[] products){
        this.products = products;
    }

    public double caculateTotal(){
        double count = 0;
        for (int i=0; i<10; i++){
            count = count + products[i].getPrice();
        }
        return count;
    }
}
