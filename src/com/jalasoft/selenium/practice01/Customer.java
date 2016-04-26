package com.jalasoft.selenium.practice01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public class Customer {

    public static final String BREAK_LINE = "\n";

    public static final String TABULATION = "\t";

    private final String name;

    private final StringBuilder result;

    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
        result = new StringBuilder();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    private double calculateTotalFrequentRenterPoints(){
        return rentals.stream().map(Rental::getFrequentRenterPoints).reduce((double) rentals.size(), (a, b) -> a + b);
    }

    private double calculateTotalAmount(){
        return rentals.stream().map(Rental::calculateCharge).reduce(0.0, (a, b) -> a + b);
    }

    public String statement() {
        result.append("Rental Record for ");
        result.append(name);
        result.append(BREAK_LINE);

        for(Rental rental: rentals){
            result.append(TABULATION);
            result.append(rental.getMovie().getTitle());
            result.append(TABULATION);
            result.append(rental.calculateCharge());
            result.append(BREAK_LINE);
        }

        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);

        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }

    public String getName() {
        return name;
    }
}
