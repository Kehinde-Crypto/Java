package Classwork;

import java.util.Scanner;

public class work {
  public static void main(String[] args) {
    System.out.println("Enter a character");
    Scanner scanner = new Scanner(System.in);
    String val = scanner.nextLine();
    for (int row = 1; row <= 6; row++) {
      for (int col = 1; col <= 4; col++) {
        System.out.print(val);
      }
      System.out.println("\n");
    }

    scanner.close();
  }
}
