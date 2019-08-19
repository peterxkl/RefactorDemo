package rentalstore;

public class NewReleseMovie extends Movie {

    public NewReleseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getThisAmount(int dayRental) {
        return dayRental * 3.0;
    }

}
