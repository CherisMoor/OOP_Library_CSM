package LibraryManagement;

public class Book extends LibraryItem {

    private int numOfPages;

    public Book(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual);
    }

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
}
