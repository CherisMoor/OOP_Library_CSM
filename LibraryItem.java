
public class LibraryItem extends LibraryMain implements IReservable, ILoanable {

    private int publishYear;
    private String title, genre, ageGroup;
    private boolean isAvailable;
    private BookCondition condition;
    public Author author = new Author();
    String firstName = author.getFirstName(), lastName = author.getLastName();
    public PublishingCompany publishingCompany = new PublishingCompany();
    public BookCondition bookCondition = condition;

    // constructor
    public LibraryItem(int publishYear, String title, Author author, String genre, String ageGroup, boolean isAvailable,
            BookCondition condition, String firstName, String lastName, PublishingCompany publishingCompany) {
        this.publishYear = publishYear;
        this.title = title;
        // this.author = author;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.isAvailable = isAvailable;
        this.condition = condition;
        this.firstName = firstName;
        this.lastName = lastName;
        this.publishingCompany = publishingCompany;
    }

    // getters

    public int getPublishYear() {
        return publishYear;
    }

    public String getTitle() {
        return title;
    }

    // public String getAuthor() {
    // return author;
    // }

    public String getGenre() {
        return genre;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public BookCondition getCondition() {
        return condition;
    }

    // setters

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // public void setAuthor(String author) {
    // this.author = Author.getFirstName();
    // }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setCondition(BookCondition condition) {
        this.condition = condition;
    }

    public LibraryItem() {

    }

    public LibraryItem(boolean isAvailable, boolean isFactual2) {
        if (isAvailable) {
            System.out.println("Yes, the book " + getTitle() + " is available");
        } else {
            System.out.println("Sorry, " + getTitle() + " is not available");
        }
    }

    public LibraryItem(int publishYear2, String title2, String author2, String genre2, String ageGroup2,
            boolean isAvailable2, BookCondition condition2, String authorFirstName, String authorLastName) {
    }

    public LibraryItem(String title2, String author2, BookCondition condition2) {
    }

    public String conditions(BookCondition x) {
        switch (x) {
            case NEW:
                return "NEW";

            case USED:
                return "USED";

            case DAMAGED:
                return "DAMAGED";

        }
        return conditions(getCondition());

    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getTitle() + " by: " + author.getFirstName() + " " + author.getLastName() + "\npublished: "
                + this.getPublishYear() + " by " + publishingCompany.getPublishingCompany() + "\n*******";
    }

    @Override
    public boolean isLoanable() {
        return true;
    }

    public String getLoanStatus() {
        return null;
    }

    public int getMaximumLoanDays() {
        return 10;
    }

    public boolean isReservable() {
        return true;
    }

    public int getReserveTerm() {
        return 15;
    }

    public int getMaxReservePerYear() {
        return 1000;
    }

    @Override
    public void lateFee(Charges fee) {

        switch (fee) {
            case DAILY:
                System.out.println("Late Fee: $2");
                break;
            case WEEKLY:
                System.out.println("Late Fee: $10");
                break;
            case BIWEEKLY:
                System.out.println("Late Fee: $20");
                break;
            case MONTHLY:
                System.out.println("Late Fee: $50");
            default:
                break;
        }
    }

}