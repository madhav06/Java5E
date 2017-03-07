
// Program6.4

// Demonstrate else if ladder

class ElseIfLadder
{

  public static void main(String[] args) {

    int rollNumber[] = { 111, 222, 333, 444};
    int marks[] = { 81, 75, 43, 58};

    for(int i = 0; i < rollNumber.length; i++)
    {

        if(marks[i] > 79)
        {
          System.out.println(rollNumber[i] + " Honors ");
          System.out.println(" ");

        }
        else if(marks[i] > 59)
        {
          System.out.println(rollNumber[i] + " I Division");
          System.out.println(" ");
        }
        else if(marks[i] > 49)
        {
          System.out.println(rollNumber[i] + " II Division");
          System.out.println(" ");
        }
          else
              System.out.println(rollNumber[i] + " FAIL ");
              System.out.println(" ");
    }
  }
}
