
class FalseTest
{
  public static void main(String[] args) {

    int number[] = {50, 65, 56, 71, 81 };
    int even = 0, odd = 0;

    for(int i = 0; i < number.length; i++)
    {
        if((number[i])%2 == 0)  // Decide even or odd
        {
          even = even + 1;
          System.out.println(number[i]);
        }
        else
        {
          odd = odd + 1;
          System.out.println(number[i]);
        }
    }
  }
}
