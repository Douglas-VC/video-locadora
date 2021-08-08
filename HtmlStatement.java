public class HtmlStatement extends Statement {

    public String getFirstPartResult(Customer aCustomer) {
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
        return result;
    }

    public String getMiddlePartResult(Rental aRental) {
        String result = aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
        return result;
    }

    public String getFinalPartResult(Customer aCustomer) {
        String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
        return result;
    }
}