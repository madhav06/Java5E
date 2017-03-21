// Exercise Prpgram  6.8

import java.io.*;

class HundredRange
{
  public static void main(String[] args) {
    //int marks = 0;
    DataInputStream in = new DataInputStream(System.in);
    int marks = 0;
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //System.out.println();
  //  System.out.println( ");
  //  System.out.println();
  //  System.out.println();

    try {
          System.out.println("Enter marks: ");
          marks = Integer.parseInt(in.readLine());
          //System.out.flush();
          //switch(marks)


          //  case 0://"In the range 81 to 100":
          if(marks >= 80)
            System.out.println("In the range 81 to 100 ");
            //break;

            //case 1://"In the range 61 to 80":
            else if(marks>=60)
            System.out.println("In the range 61 to 80");
            // break;

            //case 2://"In the range 41 to 60":
            else if(marks>40)
            System.out.println("In the range 41 to 60 ");
            //break;

            //case 3://"In the range 0 to 40":
            else
            System.out.println("In the range 0 to 40 ");
            //break;

            //default:
            //System.out.println("Invalid Choice");


    }
    catch (Exception e) {
      System.out.println("I/O Error ");
    }
  }
}
