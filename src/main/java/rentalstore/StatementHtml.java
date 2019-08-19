package rentalstore;

public class StatementHtml extends Statement {

    protected String getReceiptBody(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalAmount() + "<br>";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points<br>";
        return result;
    }

    protected String getMovieDetail(Rental each,String result) {
        result += "&nbsp;&nbsp;&nbsp;&nbsp;" + each.getMovie().getTitle() + "&nbsp;" + each.getThisAmount() + "<br>";
        return result;
    }

    protected String getReceiptHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "<br>";
    }
}
