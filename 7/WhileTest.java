// Program 7.1


class WhileTest
{
  public static void main(String[] args) {

    StringBuffer string = new StringBuffer();
    char c;
    System.out.println("Enter a string ");

    try
    {
        while ((c = (char)System.in.read()) != '\n')
        {
          string.append(c); // Append character
        }
    }

    catch (Exception e)
    {
      System.out.println("Error in input ");
    }
    System.out.print("You have entered..... --->>");
    System.out.println(string);
  }
}
