// John, Gio

public class Inventory
{
  protected ArrayList<Item> items;

  public Inventory() 
  {
    this.items = new ArrayList<>();
  }

  public void add(Inventory item)
  {
    items.add(item);
  }

  public void displayTitle(String title)
  {
    for (Item i: items)
    {
      if (i.findTitle(s))
      {
        System.out.println(i);
      }
    }
  }

  public void displayAuthor(String author)
  {
    for (Item i : items)
    {
      if (i.findAuthor(s))
      {
        System.out.println(i);
      }
    }
  }

  // change to return type String?
  public void displayAll() 
  {
    for (Item i : items)
    {
      System.out.println(i);
    }
  }

  public void sellTitle(String inputTitle)
  {
    for(Item i : items)
    {
      if(i.findTitle(inputTitle))
      {
        items.remove(i);
      }
    }
    
    displayAll();

  }


  public void sellAuthor(String author)
  {
    for (Item i : items)
    {
      if (i.findAuthor(author))
      {
        items.remove(i);
      }
    }
  }

  displayAll();
  
}