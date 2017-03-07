//Debugging exercises 6.3
class NumberValue {

  public static void main(String[] args) {

    int number = 2;
    switch (number)
    {
      case 0:
        System.out.println("Number is 0 ");
        break;

      case 1:
        System.out.println(" Number is 1 ");
        break;

      case 2:
      //System.out.println("yooo ");
      //case 3:
      case 3:
        System.out.println(" Number is 2, 3 or 4 ");
        break;

      default:
        System.out.println("Number is less than 0 or greater than 4 ");
    }
  }
}
