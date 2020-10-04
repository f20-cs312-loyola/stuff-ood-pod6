//Jaymin coded this class
public class Item
{
  protected String title;
  protected double price;
  protected boolean isNew;

  public Item(String inputTitle,double inputPrice, boolean isNewInput)
  {
    this.title = inputTitle;
    this.price = inputPrice;
    this.isNew = isNewInput;
  }

  public String toString()
  {
    return "My title is: " + title ". My price is: " + price + ". Am I new?" + isNew "."
  }

  /*
    Purpose: return true if title matches input title
    Input: title
    Output: true if title matches, false if not
  */
  public boolean findTitle(String inputTitle)
  {
    boolean result = false;
    if(this.title.equals(inputTitle))
    {
      result = true;
    }
    return result;
  }
  
  /*
    Purpose: return true if author matches input author
    Input: author
    Output: true if author found, false if not
  */
  public abstract boolean findAuthor(String inputAuthor);
}