package LibraryManagement;

public class Cardholder extends LibraryItem {
    private boolean isCardholder;

    public Cardholder(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual);
    }

    public boolean getCardholder() {
        return isCardholder;
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