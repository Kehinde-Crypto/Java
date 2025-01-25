import java.util.Scanner;
public class Question2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a value");
    String userNum = scanner.next();
    System.out.println(userNum + userNum + userNum + userNum);
    for(int i = 0; i < 3; i ++){
      System.out.println("\n" + userNum + "  " + userNum);
    }
    System.out.println("\n" + userNum + userNum + userNum + userNum );
  }
}
