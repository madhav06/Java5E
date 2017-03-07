// Exercise 6.11

/*  Shown below is a Floyd's Triangle
*   1
*   2 3
*   4 5 6
*   7 8 9 10
* 11 .. .. .. 15
* .
* .
* 79 .. .. .. .. .. .. 91
*/


class FloydTriangle {

  public static void main(String[] args) {

    int n = 8;
    int count = 1;
    for(int i = 0; i < 8; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(count++ + " ");


      }
      System.out.println();
    }
  }

}
