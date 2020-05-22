
public class Magazine extends Periodical {

    public Magazine(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFactual2, BookCondition condition, String authorFirstName, String authorLastName) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFactual2, condition, authorFirstName,
                authorLastName);
    }

}