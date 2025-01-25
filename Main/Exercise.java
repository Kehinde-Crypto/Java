import java.util.Scanner;
public class Exercise {
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int UserNum = scanner.nextInt();
     for(int i = 1; i<=20; i++){
     int remain = UserNum % i;
     System.out.print("The value is "  + remain , UserNum);
     //Scanner.close();
    }
  
      
  }
}
