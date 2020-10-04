// Gio

public class Book extends item
{
  protected String author;

  /*
    Purpose: create a Book object
    Input: title, price, isNew
    Output: new Book object
  */
  public Book(String title, double price, boolean isNew, String author)
  {
    super(title, price, isNew);
    this.author = author;
  }

   /*
    Purpose: return true if author matches input author
    Input: author
    Output: true if author matches, false if not
  */
  public boolean findAuthor(String inputAuthor)
  {
    result = false;
    if(this.author.equals(inputAuthor))
    {
      result = true;
    }
    return result;
  }

  /*
    Purpose: provide a string representation of Book object
    Input: title
    Output: true if title matches, false if not
  */
  @Override
  public String toString()
  {
    return "Author: " + author;
  }

}