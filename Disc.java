//Jaymin coded this class
public class Disc extends Item
{
  protected int releaseYear;

  public Disc(String title, double price, boolean isNew, int releaseYear)
  {
    super(title, price, isNew);
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString()
  {
    return "Release Year: " + releaseYear;
  }
}