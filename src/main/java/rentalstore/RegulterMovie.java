package rentalstore;

public class RegulterMovie extends Movie {
    public RegulterMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getThisAmount(int dayRental) {
        double thisAmount = 2;
        if (dayRental > 2) {
            thisAmount += (dayRental - 2) * 1.5;
        }
        return thisAmount;
    }
}
