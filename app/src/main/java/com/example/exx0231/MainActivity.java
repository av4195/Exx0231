package com.example.exx0231;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Product[] products = new Product[10];


        products[0] = new Book("math book",30, "A book to learn math with", 500);
        products[1] = new Clothing("Jeans",50, "Jeans that are tight at the top and loose at the bottom", "Flare");
        products[2] = new Electronics("MacBook",6649, "Apple laptop", "Apple");
        products[3] = new Book("The Hunger Games",60.90, "A thrilling story about a girl named Katniss who fights for survival in a deadly competition", 374);
        products[4] = new Book("NEW  High Five",85.99, "A book to learn English with", 200);
        products[5] = new Clothing("Hoodie",60.20, "Thick winter shirt with a hood", "Oversized Hoodie");
        products[6] = new Book("The Selection",70, "A romantic story about a girl who joins a competition to win a prince’s heart", 336);
        products[7] = new Electronics("iPhone",2694, "Apple phone", "Apple");
        products[8] = new Clothing("T-shirt",60.40, "A loose cotton shirt that’s comfortable for everyday wear.", "Oversized");
        products[9] = new Clothing("Shoes",150, "Shoes for sports", "Sports shoes.");

    }
}