
// Exercise Depreciation
// Exercise 5.6
import java.io.*;
class Depreciation
{
  public static void main(String[] args) {

    int  price = 0;
    float  value = 0;
    int services= 0;
    float deprecition = 0;

    try {
      DataInputStream in = new DataInputStream(System.in);
      System.out.println(" Enter Purchase price: " + price);
      price = Integer.parseInt(in.readLine());
      System.out.println(" Enter years of service: " + services);
        services = Integer.parseInt(in.readLine());
      //services = Float.valueOf(in.readLine().floatValue());
      System.out.println("Enter annual deprecition: " + deprecition);

      deprecition = Float.valueOf(in.readLine()).floatValue();
       value = (float)( price - (deprecition) * (services));
       System.out.println("Using formula: Salvage value = (float)( Purchase price - (Deprecition) * (Years of services)); ");
       System.out.println(" ");
      System.out.println(" Displaying Salvage Value: " + value );

    }
    catch (Exception e) {

    }

  }
}
