package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    double getThisAmount() {
        double thisAmount;
        thisAmount = movie.getThisAmount(getDayRented());
        return thisAmount;
    }

    double getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            return 2.0;
        }
        if ((getMovie().getPriceCode() == Movie.Literary_Film)) {
            return 1.5;
        }
        return 1.0;
    }
}
