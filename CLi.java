/**
   * This is my code!  It's goal is to provide a command-line interface.
   * CS 312 - Assignment 4
   * @author Dave Binkley
   * @version 1.0 9/30/20
   */


 public class CLI     // the command line interface!
 {
   /*
    * purpose: run the program
    * input:   command from the user (taken from the command line)
    * result:  the database of stuff read from stdin is updated and
               written to stdout
    */
   public static void main(String [] args)
   {
     CLI cli = new CLI();
     ItemFactory factory = new ItemFactory();
     Inventory inv = factory.readDatabase(System.in);
     cli.processCommand(args, inv, factory);
   }


   /*
    * purpose: print an error message and the program's command line options
    * input:   an error message
    * result:  message and instructions printed to stdout
    */
   private void usage(String msg)
   {
     System.err.println("\n" + msg + "\nUsage: java CLI [-d|-a|-s] <options>\n"
      + "there are three command line options\n"
      + "  (display) -d [(everything by default) | -t title | -a author ]\n"
      + "  (add)     -a DVD         \"title\" cost year   \"studio\" NEW|USED\n"
      + "  (add)     -a CD          \"title\" cost year   \"band\"   NEW|USED\n"
      + "  (add)     -a BOOK        \"title\" cost author  genre     NEW|USED\n"
      + "  (add)     -a AUDIOBOOK   \"title\" cost author \"reader\" NEW|USED\n"
      + "  (sell)    -s [-t title | -a author]");
   }


   /*
    * purpose: process the user's command
    * input:   the command arguments and the current inventory
    * result:  display requested information or inventory, inv as updated, 
    *          is written to stdout
    */
   private void processCommand(String [] args, Inventory inv, ItemFactory factory)
   {
     if (args.length == 0)
     {
       usage("");
       return;
     }

     if ("-d".equals(args[0]))
     {
       if (args.length == 1)
         ...
       else if ("-t".equals(args[1]) && args.length == 3) 
         ...
       else if ("-a".equals(args[1]) && args.length == 3)
         ...
       else
         usage("Invalid display command");
     }
     else if ("-a".equals(args[0]))
     {
       ...
     }
     else
     {
       usage("Bummer I don't know how to `" + args[0] + "'");
     }
   }
 }