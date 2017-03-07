// Program 6.1

// Counting with if statement

class IfTest
{

  public static void main(String[] args) {

    int i, count, count1, count2;
    float[] weight = { 45.0f, 55.0f, 47.0f, 51.0f, 54.0f };

    float[] height = { 176.0f, 174.2f, 168.0f, 170.7f, 169.0f };

    count = 0;
    count1 = 0;
    count2 = 0;

    for(i = 0; i <= 4; i++)
    {
      if(weight[i] < 50.0 && height[i] > 170.0)
      {
        count1 = count1 + 1;
      }
      count = count + 1; // total persons
    }
    count2 = count - count1;

    System.out.println("Number of persons with ...");
    System.out.println(" ");
    System.out.println(" Weight < 50 and height >170 = " + count1);
    System.out.println(" ");
    System.out.println(" Others = " + count2);
  }
}
