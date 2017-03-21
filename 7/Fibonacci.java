//

class Fibonacci
{
  public static void main(String[] args) {

    int num = 0;
    int num2 = 1;
    int loop;
    int fibonacci;

    System.out.print(num2);

    do {
          fibonacci = num + num2;
          num = num2;
          System.out.print(" " +  fibonacci);
    }
    while (loop <= 10);
        //System.out.print(" " +  fibonacci);

  }
}
