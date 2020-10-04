// Gio

public class AudioBook extends Book
{
  protected String reader;

  public AudioBook(String title, double price, boolean isNew, String author, String reader)
  {
    super(title, price, isNew, author);
    this.reader = reader;
  }

  @Override
  public String toString()
  {
    return "Reader: " + reader;
  }

}