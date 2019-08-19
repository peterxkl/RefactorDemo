package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_a_receipt_when_render_a_Titanic() throws Exception {

        //given
        Movie movie = new NewReleseMovie("Titanic",1);
        Rental rental = new Rental(movie , 2);
        Customer customer = new Customer("Dillon");
        customer.addRental(rental);

        //when
        String result = customer.statement();

        //then
        assertEquals("Rental Record for Dillon\n" +
                "\tTitanic\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2.0 frequent renter points" , result);

    }

    @Test
    public void should_return_a_receipt_when_render_Three_Titanic() {

        //given
        Movie movie1 = new RegulterMovie("Titanic1",Movie.REGULAR);
        Movie movie2 = new NewReleseMovie("Titanic2",Movie.NEW_RELEASE);
        Movie movie3 = new ChildrenMovie("Titanic3",Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1 , 2);
        Rental rental2 = new Rental(movie2 , 1);
        Rental rental3 = new Rental(movie3 , 3);
        Customer customer = new Customer("Dillon");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        //when
        String result = customer.statement();

        //then
        assertEquals("Rental Record for Dillon\n" +
                "\tTitanic1\t2.0\n" +
                "\tTitanic2\t3.0\n" +
                "\tTitanic3\t1.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 3.0 frequent renter points" , result);

    }

    @Test
    public void should_return_a_receipt_when_render_three_Titanic() {

        //given
        Movie movie1 = new RegulterMovie("Titanic1",Movie.REGULAR);
        Movie movie2 = new NewReleseMovie("Titanic2",Movie.NEW_RELEASE);
        Movie movie3 = new ChildrenMovie("Titanic3",Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1 , 3);
        Rental rental2 = new Rental(movie2 , 2);
        Rental rental3 = new Rental(movie3 , 4);
        Customer customer = new Customer("Dillon");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        //when
        String result = customer.statement();

        //then
        assertEquals("Rental Record for Dillon\n" +
                "\tTitanic1\t3.5\n" +
                "\tTitanic2\t6.0\n" +
                "\tTitanic3\t3.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4.0 frequent renter points" , result);

    }

    @Test
    public void should_return_a_receipt_when_render_three2_Titanic() {

        //given
        Movie movie1 = new RegulterMovie("Titanic1",Movie.REGULAR);
        Movie movie2 = new NewReleseMovie("Titanic2",Movie.NEW_RELEASE);
        Movie movie3 = new ChildrenMovie("Titanic3",Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1 , 1);
        Rental rental2 = new Rental(movie2 , 1);
        Rental rental3 = new Rental(movie3 , 2);
        Customer customer = new Customer("Dillon");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        //when
        String result = customer.statement();

        //then
        assertEquals("Rental Record for Dillon\n" +
                "\tTitanic1\t2.0\n" +
                "\tTitanic2\t3.0\n" +
                "\tTitanic3\t1.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 3.0 frequent renter points" , result);

    }

    @Test
    public void should_return_a_receipt_when_render_four_Titanic() {

        //given
        Movie movie1 = new RegulterMovie("Titanic1",Movie.REGULAR);
        Movie movie2 = new NewReleseMovie("Titanic2",Movie.NEW_RELEASE);
        Movie movie3 = new ChildrenMovie("Titanic3",Movie.CHILDRENS);
        Movie movie4 = new LiteraryMovie("Titanic4",Movie.Literary_Film);
        Rental rental1 = new Rental(movie1 , 1);
        Rental rental2 = new Rental(movie2 , 1);
        Rental rental3 = new Rental(movie3 , 2);
        Rental rental4 = new Rental(movie4 , 5);
        Customer customer = new Customer("Dillon");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);

        //when
        String result = customer.statement();

        //then
        assertEquals("Rental Record for Dillon\n" +
                "\tTitanic1\t2.0\n" +
                "\tTitanic2\t3.0\n" +
                "\tTitanic3\t1.5\n" +
                "\tTitanic4\t30.0\n" +
                "Amount owed is 36.5\n" +
                "You earned 4.5 frequent renter points" , result);

    }

}