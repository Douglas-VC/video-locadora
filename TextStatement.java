public class TextStatement extends Statement {

    public String getFirstPartResult(Customer aCustomer) {
        String result = "Rental Record for " + aCustomer.getName() + "\n";
        return result;
    }

    public String getMiddlePartResult(Rental aRental) {
        String result = "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
        return result;
    }

    public String getFinalPartResult(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
}