//Debugging exercises 6.1


import java.io.*;

class IfElse
{
  public static void main(String[] args) {

    DataInputStream in = new DataInputStream(System.in);

    float result = 0;
    char grade;
    try{

      System.out.print("Enter an Integer:  ");
      //result = Integer.parseInt(in.readLine()); ---- for getting INT values uncomment it.
      result = Float.valueOf(in.readLine()).floatValue();   // -----------for getting Float values

      if(result >= 90)
      {
        grade = 'A';
      }
      else if(result >= 80)
      {
        grade = 'B';
      }
      else if(result >= 70)
      {
        grade = 'C';
      }
      else if(result >= 60)
      {
        grade = 'D';
      }
      else if (result < 55)
      {
        grade = 'F';
        System.out.println( "Failed ");
      }
      else{
        grade = 'G';
      }

      System.out.println("Grade of the Student is " + grade);
    }

    catch (Exception e){

    }
  }

}
