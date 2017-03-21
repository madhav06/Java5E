//

class Factorial
{
    public static void main(String[] args) {
      int m = 0;
      int num = 0;
      int fact = 1;
    //  int fact = m;

      for( num = m; num >= 1; num--)
      {
          fact = fact * num;
      }

      System.out.println("Factorial of m is " + fact);

    }
}
