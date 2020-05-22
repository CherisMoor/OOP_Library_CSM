
public class Cardholder extends LibraryItem {
    public Cardholder(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual2, BookCondition condition, String authorFirstName, String authorLastName) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual2, condition, authorFirstName,
                authorLastName);
    }

    private boolean isCardholder;
    private String cardholderName;
    private boolean canCheckout;
    private String dateJoined;

    public String getCardholderName() {
        return cardholderName;
    }

    public boolean getCheckoutStatus() {
        return canCheckout;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public boolean getCardholder() {
        return isCardholder;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public void setCheckoutStatus(boolean canCheckout) {
        this.canCheckout = canCheckout;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setCardholder(boolean isCardholder) {
        this.isCardholder = isCardholder;
    }

    public void LibraryItem(boolean isCardholder) {
        if (isCardholder) {
            System.out.println("You may rent books");
        } else {
            System.out.println("You are not a member. Would you like to sign-up?");
        }
    }
}