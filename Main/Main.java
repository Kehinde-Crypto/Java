// QUESTION
//WRITE A JAVA PROGRAM THAT SWAPS TWO NUMBERS USING ONLY THREE VARIABLES WHICH INCLUDES THOSE HOLDING THE TWO NUMBERS

//  WRITE A JAVA PROGRAM THAT CALCULATES THE VOLUME OF A SPHERE V = 4/3 * PI * R^3 TAKE INPUT USING THE CODE
// Scanner scanner = new Scanner(System.in)
// int num = scanner.nextline();
// import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 6;
    int num3;
    num3 = num1;
    num1 = num2;
    num2 = num3;
    System.out.printf("These are the values that will be swapped %d , %d", num1, num2);
  }

}