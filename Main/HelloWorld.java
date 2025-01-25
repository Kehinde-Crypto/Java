import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    double PI = 3.14159D;
    double radius;
    radius = num;
    double Vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.printf("The volume of a sphere is :", Vol, PI);
    scanner.close();
  }
}
