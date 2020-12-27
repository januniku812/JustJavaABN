package com.example.android.justjava;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */


public class MainActivity<View> extends AppCompatActivity {

    /** intial number of coffee */

    int numberOfCoffees = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(android.view.View view){
        display(numberOfCoffees);
        displayPrice(numberOfCoffees);
    }

    public void increment(android.view.View view){
        numberOfCoffees = numberOfCoffees+1;
        display(numberOfCoffees);
//        updating the price as the order goes UP therefore total price increases
        displayPrice(numberOfCoffees);


    }
//        updating the price as the order goes DOWN therefore total price reduces
    public void decrement(android.view.View view){
        numberOfCoffees = numberOfCoffees-1;
        display(numberOfCoffees);
    }

    /** Number of coffee var goes inside number and numberInput, displaying the amount of Coffee and price respectively*/
    //    displaying the total number of cups ordered
    private void display(int number) {
        TextView quantityTextView  = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText(number);
    }
//    displaying the total price for the respective number of cups ordered
    private void displayPrice(int numberInput) {
        TextView quantityPriceTextView  = (TextView) findViewById(
                R.id.quantity_price_text_view);
        int price=numberInput*5;
        quantityPriceTextView.setText("Total: "+"$"+ price + "\n" + "Thank you!");

    }
    //used if a string is needed where the price is(eg. "free")
    private void displayMessage(String string){
        TextView quantityPriceTextView  = (TextView) findViewById(
                R.id.quantity_price_text_view);
        quantityPriceTextView.setText(string);
    }


}
