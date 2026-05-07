import java.util.Scanner;
public class Array{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    int sum = 0;

    System.out.println("Enter 5 numbers: ");
    for(int i = 0; i<5; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Array elements: ");
    for(int i = 0; i<5; i++){
      System.out.println(arr[i] + "");
    }

    int max = arr[0];
    int min = arr[0];

    for(int i = 0; i<5; i++){
      sum = sum + arr[i];

    if(arr[i] > max){
      max = arr[i];
    }

    if(arr[i] < min){
      min = arr[i];
    }
    }
    double averge = sum/5.0;

    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    sc.close();
  }
}
        
