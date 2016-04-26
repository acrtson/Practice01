package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/26/2016.
 */
public class Children extends Movie {
    public Children(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double amountMovie = 1.5;
        return (daysRented > 3)? ((daysRented - 3) * 1.5) : amountMovie;
    }
}
