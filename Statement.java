import java.util.Enumeration;

public abstract class Statement {

    public abstract String getFirstPartResult(Customer aCustomer);

    public abstract String getMiddlePartResult(Rental aRental);

    public abstract String getFinalPartResult(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstPartResult(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += getMiddlePartResult(each);
        }
        // add footer lines
        result += getFinalPartResult(aCustomer);
        return result;
    }
}
