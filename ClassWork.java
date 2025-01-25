public class ClassWork {
  public static void main(String[] args) {
    int[][] myNumbers = {{1 , 2 , 3 , 4, 5 } , {7 ,8 ,9 ,4}};
    for(int i = 0; i < myNumbers.length; i++) {
      for(int j = 0; j<myNumbers[i].length; j++){
        System.out.print(myNumbers[i][j] + "\t");
      }
      System.out.println();
    }

  
  }
} 
