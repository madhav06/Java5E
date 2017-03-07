

public class FloydTiangle {

  public static void main(String[] args) {

    int n = 8;
    int count = 1;
    for(int i = 0; i < 8; i++) {
      for(int j = 0; j <= i; j++) {
        if(count % 2 == 0) {
          System.out.print("0" + " ");
        }

        else
        {
          System.out.print("1" + " ");
        }
        count = count + 1;
      }
      System.out.println();
    }
  }

}
