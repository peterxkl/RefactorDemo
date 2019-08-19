package rentalstore;

public class StatementText extends Statement {

    protected String getReceiptBody(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalAmount() + "\n";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    protected String getMovieDetail(Rental each,String result) {
        result += "\t" + each.getMovie().getTitle() + "\t" + each.getThisAmount() + "\n";
        return result;
    }

    protected String getReceiptHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
