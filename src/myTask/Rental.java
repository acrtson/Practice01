package myTask;

/**
 * Created by Alex Alvarez on 4/18/2016.
 */
public class Rental {
    private final Movie movie;
    private final int daysRented;
    private double amountMovie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double calculateAmountMovie(){
        switch (this.movie.getPriceCode()) {
            case MovieType.REGULAR:
                amountMovie = 2;
                if (this.daysRented > 2)
                    amountMovie = (this.daysRented - 2) * 1.5;
                break;
            case MovieType.NEW_RELEASE:
                amountMovie = this.daysRented * 3;
                break;
            case MovieType.CHILDREN:
                amountMovie = 1.5;
                if (this.daysRented > 3)
                    amountMovie = (this.daysRented - 3) * 1.5;
                break;
        }
        return amountMovie;
    }
}
