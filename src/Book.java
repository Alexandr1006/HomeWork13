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

      public String toString(){
      return "Название " + name + " Автор " + author + " Год издания " + yearEdition;
      }
}
