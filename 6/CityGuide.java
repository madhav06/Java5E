// Program 6.5
// Testing the switchide

class CityGuide
{
    public static void main(String[] args) {

      char choice;
      System.out.println("Select your choice ");

      System.out.println(" M -> Madras ");
      System.out.println(" B -> Bombay ");
      System.out.println(" C -> Calcutta ");
      System.out.println(" Choice ----> ");

      System.out.flush(); // clears the output stream after writing the left-over bytes (if any).

      try {
              switch (choice = (char) System.in.read())
              {
                case 'M':
                case 'm': System.out.println("Madras :  Booklet 5 ");
                break;

                case 'B':
                case 'b': System.out.println("Bombay : Booklet 9 ");
                break;

                case 'C':
                case 'c': System.out.println(" Calcutta : Booklet 15 ");
                break;

                default:  System.out.println(" Invalid Choice (IC) ");

              }
      }

      catch (Exception e)
      {
          System.out.println(" I/O Error ");
      }
    }
}
