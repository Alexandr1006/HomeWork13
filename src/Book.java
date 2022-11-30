import java.util.Objects;

public class Book {
   private final String name;
   private final Author author;
   private int yearEdition;

   public Book (String name, int yearEdition, Author author){
      this.name = name;
      this.yearEdition = yearEdition;
      this.author = author;
   }
      public String getName(){
      return this.name;
      }

      public void setyearEdition(int yearEdition){
       this.yearEdition = yearEdition;
      }
      public int getYearEdition(){
      return this.yearEdition;
      }

      public Author getAuthor() {
      return this.author;
   }

      @Override
      public String toString(){
      return "Название " + name + " Автор " + author + " Год издания " + yearEdition;
      }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return yearEdition == book.yearEdition && Objects.equals(name, book.name) && Objects.equals(author, book.author);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, author, yearEdition);
   }
}
