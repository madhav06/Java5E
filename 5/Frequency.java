

// Exercises Frequency

// Exercise 5.10
import java.io.*;

class Frequency
{

  public static void main(String[] args) {

    try {

      DataInputStream in = new DataInputStream(System.in);
      int l = Integer.parseInt(in.readLine());
      System.out.println(" Enter Inductance L : " + l);

      int r = Integer.parseInt(in.readLine());
      System.out.println(" Enter Resistance R : " + r);

      float c = Float.valueOf(in.readLine()).floatValue();
      System.out.println(" Enter Capacitance C : " + c);


      //System.out.println(" Enter  : " + u);
      //u = Integer.parseInt(in.readLine());

      float f = (float) Math.sqrt(Math.abs((1/(l*c)) - (r*r/4*(c*c))));

      System.out.println("Using formula: Frequency = sqrt((1/L*C) - (R*R/4*C*C));");
      System.out.println(" ");
     System.out.println(" Displaying Frequency : " + f );
    }

    catch(Exception e) {

    }
  }
}
