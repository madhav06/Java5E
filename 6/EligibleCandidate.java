
// Exercise 6.9

import java.io.*;

class EligibleCandidate
{
  public static void main(String[] args) {

    DataInputStream in = new DataInputStream(System.in);

    int m_marks = 0;
    int p_marks = 0;
    int c_marks = 0;

    try{

      System.out.println("Input : ");
      m_marks = Integer.parseInt(in.readLine());
      p_marks = Integer.parseInt(in.readLine());
      c_marks = Integer.parseInt(in.readLine());

      if(m_marks >= 60 && p_marks >= 50 && c_marks >= 40)
      {
        if(m_marks + p_marks + c_marks >= 200 || m_marks + p_marks >= 150)
          {
              System.out.println("Eligible !");
          }
          else
              System.out.println("Not-Eligible !");
      }
      else
        System.out.println("Not - Eligible !");

    }
    catch(Exception e){
      System.out.println("I/O Error");
    }
  }
}
