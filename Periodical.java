package LibraryManagement;

public class Periodical extends LibraryItem {
    public Periodical(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual);
    }

    private boolean hasColorImg;

    public boolean getColor() {
        return hasColorImg;
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
}