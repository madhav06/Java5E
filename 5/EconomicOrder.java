

// Exercise Economic Order

// Exercises 5.9

import java.io.*;

class EconomicOrder
{

  public static void main(String[] args) {

    try{

      DataInputStream in = new DataInputStream(System.in);

      System.out.print("Enter setup costs :  ");
      int cost = Integer.parseInt(in.readLine());


      System.out.print("Enter demand rates :  ");
      int rates = Integer.parseInt(in.readLine());

      System.out.print("Enter holding cost per item :  ");
      int holding = Integer.parseInt(in.readLine());


      float eoq = (float) Math.sqrt((2*rates*cost) / holding );

      System.out.println(" USE FORMULA : EOQ  = Sqrt((2*rates*cost) / holding )  " );

      System.out.println(" ");

      System.out.print(" Display EOQ = " + eoq);

        System.out.println(" ");

      System.out.print("=============================================================");
        System.out.println(" ");
          System.out.println(" ");

      float tbo = (float) Math.sqrt((cost) / (rates * holding));

      System.out.println(" USE FORMULA : TBO = Sqrt((cost) / (rates * holding)) " );

      System.out.println(" ");

        System.out.println(" Display TBO = " + tbo);

        System.out.println(" ");

    }

    catch (Exception e ) {

    }
  }
}
