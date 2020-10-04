// Barbara Kavanaugh

public class PrintBook extends Book
{
  protected String genre;

  public PrintBook(String title, double price, String author, String g, boolean isNew)
  {
    super(title, price, isNew);
    this.genre = g;
  }

  @Override
  public string toString()
  {
    return("Genre: "+ genre);
  }

}