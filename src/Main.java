public class Main {
    public static void main(String[] args) {
        Author author = new Author ("Александр", "Дюма");
        Author author1 = new Author("Герберт", "Уэ́ллс");
        Author author2 = new Author("Герберт", "Уэ́ллс");
        Book book = new Book("Три мушкетера",1844, author);
        Book book1 = new Book("The Invisible Man", 1897, author1);
        Book book2 = new Book("The Invisible Man", 1897, author1);

        System.out.println(author.getNameAuthor() + " " + author.getSurnameAuthor() + " " + book.getName() + " " +  book.getYearEdition());
        System.out.println(author1.getNameAuthor() + " " + author1.getSurnameAuthor() + " " + book1.getName() + " " + book1.getYearEdition());
        book.setyearEdition(1944);
        System.out.println(book.getYearEdition());

// Использую метод toString
        System.out.println(author1);
        System.out.println(book1);

//Cравниваю с помощью метода equals
        System.out.println(author1.equals(author2));
        System.out.println(book.equals(book1));

 //Сравниваю с помощью hashCode author1,author2
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}