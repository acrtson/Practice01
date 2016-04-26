package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public abstract class Movie {
    private final String title;
    protected final int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public abstract double calculateAmount(int daysRented);

    public int getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }
}
