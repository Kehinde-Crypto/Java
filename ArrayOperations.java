
//

public class ArrayOperations {
  public static void main(String[] args) {
    // Initialize the array
    int[] numbers = { 4, 2, 9, 6, 1, 7, 3, 5 };

    // 1. Add all elements of the array
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }

    // 2. Find the smallest element of the array
    int min = numbers[0];
    for (int num : numbers) {
      if (num < min) {
        min = num;
      }
    }

    // 3. Find the highest element of the array
    int max = numbers[0];
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }

    // Print the results
    System.out.println("Sum of all elements: " + sum);
    System.out.println("Smallest element: " + min);
    System.out.println("Highest element: " + max);
  }
}
