package rentalstore;

public class LiteraryMovie extends Movie {
    public LiteraryMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getThisAmount(int dayRental) {
        return dayRental * 6.0;
    }
}
