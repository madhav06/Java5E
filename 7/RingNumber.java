
// Exercise 7.10 (c)
import java.io.*;


class RingNumber
{
  public static void main(String[] args) throws Exception {

      //int p, q, i;


      DataInputStream in = new DataInputStream(System.in);
      System.out.print(" input: ");
      int n = Integer.parseInt(in.readLine());



    System.out.println("The Right Triangle is shown below! ");

    for(int p = 0; p < n; p++)
    {
      for(int q = 0; q <= n; q++)
      {
        if(q <= n-1-p)
        {
          System.out.print(" ");
        }
        else
          System.out.print("*");
      }
      System.out.println();
    }
  }
}
