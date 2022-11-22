public class Main {
    public static void main(String[] args) {
        Author author = new Author ("Александр", "Дюма");
        Author author1 = new Author("Герберт", "Уэ́ллс");
        Book book = new Book("Три мушкетера",1844, author);
        Book book1 = new Book("The Invisible Man", 1897, author1);

        System.out.println(author.getNameAuthor() + " " + author.getSurnameAuthor() + " " + book.getName() + " " +  book.getYearEdition());
        System.out.println(author1.getNameAuthor() + " " + author1.getSurnameAuthor() + " " + book1.getName() + " " + book1.getYearEdition());
        book.setyearEdition(1944);
        System.out.println(book.getYearEdition());

    }
}