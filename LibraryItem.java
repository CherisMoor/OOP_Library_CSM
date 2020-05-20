package LibraryManagement;

public class LibraryItem {

    private int publishYear;
    private String title, author, genre, ageGroup;
    private boolean isAvailable, isFactual;

    // constructor
    public LibraryItem(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual2) {
        this.publishYear = publishYear;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.isAvailable = isAvailable;
        this.isFactual = isFactual;
    }

    // getters

    public int getPublishYear() {
        return publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public boolean getFactuality() {
        return isFactual;
    }

    // setters

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setFactuality(boolean isFactual) {
        this.isFactual = isFactual;
    }

    public LibraryItem(boolean isAvailable, boolean isFactual) {
        if (isAvailable) {
            System.out.println("Yes, the book " + getTitle() + " is available");
        } else {
            System.out.println("Sorry, " + getTitle() + " is not available");
        }
        if (isFactual) {
            System.out.println("Reference book or Newspaper");
        } else {
            System.out.println("General book or Magazine");
        }
    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published " + this.getPublishYear();
    }

}