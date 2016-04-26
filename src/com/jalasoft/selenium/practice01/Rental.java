package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public class Rental {

    private final Movie movie;

    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge(){
        return movie.calculateAmount(daysRented);
    }

    public double getFrequentRenterPoints(){
        return ((movie.getPriceCode() == MovieType.NEW_RELEASE) && daysRented > 1) ? 1.0 : 0.0;
    }

    public Movie getMovie() {
        return movie;
    }

}
