public class Book //extend item
{
  protected String author;

  public Book(String title, double price, boolean isNew, String author)
  {
    super(title, price, isNew);
    this.author = author;
  }

}