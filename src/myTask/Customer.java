package myTask;

import java.util.Vector;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public class Customer {
    private String name;
    private String result = "";
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        _rentals.addElement(rental);
    }

    private int calculateTotalFrequentRenterPoints(){
        int frequentedRenterPoints = _rentals.size();

        for(Rental each: _rentals){
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == MovieType.NEW_RELEASE) && each.getDaysRented() > 1){
                frequentedRenterPoints++;
            }
        }
        return frequentedRenterPoints;
    }

    private int calculateTotalAmount(){
        int amount = 0;
        for(Rental each: _rentals){
            amount += each.calculateAmountMovie();
        }
        return amount;
    }

    public String statement() {
        result += "Rental Record for " + getName() + "\n";

        for(Rental each: _rentals){
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.calculateAmountMovie()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(calculateTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(calculateTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
}
