
public class Periodical extends LibraryItem {

    public Periodical(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            BookCondition condition, String authorFirstName, String authorLastName) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, condition, authorFirstName, authorLastName);
    }

    public Periodical() {

    }

    private boolean hasColorImg;
    private int issueNum;

    public int getIssueNum() {
        return issueNum;
    }

    public boolean getColor() {
        return hasColorImg;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public void setColor(boolean hasColorImg) {
        this.hasColorImg = hasColorImg;
    }

    public void LibraryItem(boolean hasColorImg) {
        if (hasColorImg) {
            System.out.println("A magazine");
        } else {
            System.out.println("A newspaper");
        }
    }

    public void LibraryItem(int issueNum) {
        if (issueNum > 0) {
            System.out.println("You have issue number: " + issueNum);
        } else {
            System.out.println("That is an invalid issue Number");
        }
    }

    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public int getReserveTerm() {
        return 5;
    }

    @Override
    public int getMaxReservePerYear() {
        return 100;
    }
}