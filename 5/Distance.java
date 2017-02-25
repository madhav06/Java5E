// Exercises Distance

// Exercise 5.8

import java.io.*;
class Distance
{
  public static void main(String[] args) {


    int  d = 0;
    int  u = 0;
    int a= 0;
    int t = 0;

    try{
            DataInputStream in = new DataInputStream(System.in);

            System.out.println(" Enter Initial velocity : " + u);
            u = Integer.parseInt(in.readLine());

            System.out.println(" Enter acceleration : " + a);
            a = Integer.parseInt(in.readLine());

            System.out.println(" Enter Intervals of time : " + t);
            t = Integer.parseInt(in.readLine());


            d = u*t + (a*t*t) / 2;

            System.out.println("Using formula: distance = ut + a*t*t/2 ");
            System.out.println(" ");
           System.out.println(" Displaying Distance : " + d );

    }

    catch (Exception e) {

    }

  }
}
