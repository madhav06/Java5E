// Program 4.13 Exercises

import java.io.DataInputStream;

class Harmonic
{
  public static void main(String[] args) {

    DataInputStream in = new DataInputStream(System.in);
    int n;
    double sum = 0;
    try{
    System.out.print(" n : ");
    n = Integer.parseInt(in.readLine());
    //double one = 1;
    for(int i = 1; i <= n; i++)
    {
      sum = sum + (double) 1/i;
    }
    System.out.println("Harmonic Series = " + sum);
  }
    catch(Exception e){
      //System.out.println("Harmonic Series = " + sum);
    }
  }
}
