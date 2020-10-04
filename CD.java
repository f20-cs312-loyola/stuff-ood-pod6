// Barbara Kavanaugh
 
public class CD extends Disc
{
  protected String band;

  public CD(String title, double price, String releaseYear, String b, boolean isNew)
  {
    super(title, price, isNew, releaseYear);
    this.band = b;
  
  @Override
  public String toString()
  {
    return("Band: "+ band);
  }
}