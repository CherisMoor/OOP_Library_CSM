public class LibraryMain {
    public static void main(String[] args) {
        Author author1 = new Author("Lois", "Lowery");
        Author author2 = new Author("Harper", "Lee");
        Book book1 = new Book();
        Book book2 = new Book();

        author1.setAuthor("Harper Lee");
        author2.setAuthor("Lois Lowery");
        book1.setTitle("To Kill A Mockingbird");
        book2.setTitle("Number the Stars");
        book1.setAuthor(author1);
        book2.setAuthor(author2);
        book1.setPublishYear(1960);
        book2.setPublishYear(1989);
        book1.publishingCompany.setPublishingCompany("Liberal Reader");
        book2.publishingCompany.setPublishingCompany("Foreign Publishers");

        System.out.println(book1);
        System.out.println(book2);

    }
}