
public class Book extends LibraryItem {

    public Book(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual2, BookCondition condition, String authorFirstName, String authorLastName) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual2, condition, authorFirstName,
                authorLastName);
    }

    private int numOfPages;

    public int getNumofPages() {
        return numOfPages;
    }

    public void setNumofPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void LibraryItem(int numOfPages) {
        if (numOfPages < 20)

        {
            setAgeGroup("Child book");
        } else if (numOfPages > 20) {
            setAgeGroup("Adult book");
        } else {
            System.out.println("We don't have any books left");
        }
    }

    @Override
    public String getLoanStatus() {
        return null;
    }

    public int getMaximumLoanDays() {
        return 10;
    }

    public boolean isLoanable() {
        return true;
    }

}
