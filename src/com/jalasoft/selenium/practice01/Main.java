package com.jalasoft.selenium.practice01;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("A.J.");

        Movie newRelease = new New_Release("The Revenant", MovieType.NEW_RELEASE);
        Rental rental1 = new Rental(newRelease, 2);
        customer.addRental(rental1);

        Movie newRegular = new Regular("Terminator", MovieType.REGULAR);
        Rental rental2 = new Rental(newRegular, 2);
        customer.addRental(rental2);

        System.out.println(customer.statement());
    }
}
