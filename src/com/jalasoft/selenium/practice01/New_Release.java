package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/19/2016.
 */
public class New_Release extends Movie {
    public New_Release(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }
}
