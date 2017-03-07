// Program 6.6

// Using String with switch()

import java.io.*;

class Division
{
    public static void main(String[] args) {

      String choice = new String();

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



      System.out.println("Choose your division: ");

          System.out.println("Length");


      System.out.println(" Honors ");
      System.out.println(" First ");
      System.out.println(" Second ");
      System.out.println(" Third ");
      System.out.println(" Fail ");

      System.out.print(" Enter your choice ---> ");

      try {



            choice = br.readLine();
            System.out.flush();
            switch(choice)

            {
                case "Length":
                System.out.print(" Enter String length: ");
                int l = Integer.parseInt(br.readLine());
                System.out.println(l/0);

                case "Honors":
                System.out.println(" Marks >= 80%");
                break;

                case "First":
                System.out.println(" Marks >= 65% and < 80% ");
                break;

                case "Second":
                System.out.println(" Marks >= 55% and < 65% ");
                break;

                case "Third":
                System.out.println(" Marks >= 40% and < 55% ");
                break;

                case "Fail":
                System.out.println("Marks < 40% ");
                break;

                default:
                System.out.println(" Invalid Choice ");
            }
      }

      catch(Exception e )
      {
        System.out.println(" I/O Error ");
      }
    }
}
