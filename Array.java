import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    int[][] value = new int[2][10];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println("Enter the value " + (i + 1) + " and" + (j + 1));
        value[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 10; j++) {
        // System.out.println("Enter the value " + (i + 1) + " and" + (j + 1) + " = " +
        // value[i][j]);
        // value[i][j] = sc.nextInt();
        System.out.println("Element " + ( i+1) + "and"  + (j+1) + "=" + value[i][j]);
      }
    }
   
  }
  
}
