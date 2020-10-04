public class DVD extends Disc
{
  protected String studio;

  public DVD(int releaseYear, String studio)
  {
    super(releaseYear);
    this.studio = studio;
  }

  @Override
  public String toString()
  {
    return "Studio: " + studio;
  }
}