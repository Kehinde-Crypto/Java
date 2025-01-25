package Classwork;

import java.util.Scanner;

public class work_2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String value = in.nextLine();
    for (int row = 1; row <= 4; row++) {
      for (int col = 1; col <= 6; col++) {
        if (row == 1 && row == 6) {
          System.out.println(value);
        } else if (col == 1 || col == 4) {
          System.out.println("   ");
        }
      }
    }

  }

}
