import java.io.*;

class InputSimple
{

    public static void main(String[] args) {

      char month;

      System.out.print(" Select Any month :  ");
      System.out.println(" J ->  January ");
      System.out.println(" F ->  February ");
      System.out.println(" M ->  March ");

      System.out.print(" month --->>> ");
      System.out.flush();

      try{
            switch (month = (char) System.in.read())
            {
              case 'J':
              case 'j': System.out.println(" Janury ");
              break;

              case 'F':
              case 'f': System.out.println(" February ");
              break;

              case 'M':
              case 'm': System.out.println(" March ");
              break;

              default:
                System.out.println (" Invalid Choice (IC) ");
            }
      }

      catch(Exception e) {
          System.out.println(" I/O Error !!");
      }
    }
}
