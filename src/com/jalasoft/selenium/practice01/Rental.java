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

    public double calculateCharge(){
        double amountMovie = 0;
        switch (movie.getPriceCode()) {
            case MovieType.REGULAR:
                amountMovie = 2;
                if (daysRented > 2)
                    amountMovie = (daysRented - 2) * 1.5;
                break;
            case MovieType.NEW_RELEASE:
                amountMovie = daysRented * 3;
                break;
            case MovieType.CHILDREN:
                amountMovie = 1.5;
                if (daysRented > 3)
                    amountMovie = (daysRented - 3) * 1.5;
                break;
        }
        return amountMovie;
    }

    public double getFrequentRenterPoints(){
        return ((movie.getPriceCode() == MovieType.NEW_RELEASE) && daysRented > 1) ? 1.0 : 0.0;
    }

    public Movie getMovie() {
        return movie;
    }

}
