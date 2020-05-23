
public class Book extends LibraryItem {

    public Book(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            BookCondition condition, String authorFirstName, String authorLastName) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, condition, authorFirstName, authorLastName);
    }

    public Book() {

    }

    public Book(String title, String author, BookCondition condition) {
        super(title, author, condition);
    }

    private int numOfPages;

    public int getNumofPages() {
        return numOfPages;
    }

    public void setBookCondition(BookCondition condition) {
        this.bookCondition = condition;
    }

    public void setPublishCompany(PublishingCompany company) {
        this.publishingCompany = company;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
