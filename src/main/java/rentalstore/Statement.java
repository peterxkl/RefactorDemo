package rentalstore;

public abstract class Statement {
    public String statement(Customer customer) {
        String result = getReceiptHeader(customer);
        for (Rental each : customer.getRentals()) {
            result = getMovieDetail(each,result);
        }
        result = getReceiptBody(customer, result);
        return result;
    }

    protected abstract String getReceiptBody(Customer customer, String result);

    protected abstract String getMovieDetail(Rental each, String result);

    protected abstract String getReceiptHeader(Customer customer);
}
