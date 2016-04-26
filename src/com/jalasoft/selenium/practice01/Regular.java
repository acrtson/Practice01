package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/19/2016.
 */
public class Regular extends Movie {
    public Regular(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double amountMovie = 2;
        return (daysRented > 2)? ((daysRented - 2) * 1.5) : amountMovie;
    }
}
