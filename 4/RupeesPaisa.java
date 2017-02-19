import java.io.DataInputStream;
class RupeesPaisa
{
  public static void main(String[] args) {

    DataInputStream in = new DataInputStream(System.in);
    double rupees = 00.00;
    //double sum = 0;
    try{
    System.out.print(" rupees : ");
    rupees = Integer.parseInt(in.readLine());
    System.out.print(" In Rupees : " + rupees);
    System.out.print(" In Paisa : " + rupees*100);
  }

  catch(Exception e){
    //System.out.println("Harmonic Series = " + sum);
    System.out.print(" In Rupees : " + rupees);
    System.out.println(" ");
    System.out.print(" In Paisa : " + rupees*100);
  }

}
}
