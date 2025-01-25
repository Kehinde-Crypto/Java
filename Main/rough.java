import java.util.Scanner;

public class rough {
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.println("enter pi");
   double pi = scanner.nextDouble();
   System.out.println("enter r");
   double r = scanner.nextDouble();
   double v = (4 / 3)  * Math.PI * Math.pow(r, 3);
  System.out.println("Result is " + v);
   scanner.close();   
  }
}
