import java.util.Scanner;
     public class MathDemo{
       void power(int a){
           System.out.println("Square: " + (a*a));
       }
       void power(double a){
           System.out.println("Square: " + (a*a));
       }
       void absolute(int a){
           if(a<0)
             a=-a;
         System.out.println("Absolute value: " + a);
       }
       void absolute(double a){
           if(a<0)
             a=-a;
         System.out.println("Absolute value: " + a);
       }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      MathDemo obj = new MathDemo();

      System.out.print("Enter the integer number: ");
      int x = sc.nextInt();
      obj.power(x);
      obj.absolute(x);

      System.out.print("\nEnter the decimal number: ");
      double y = sc.nextDouble();
      obj.power(y);
      obj.absolute(y);

      System.out.println("\nInteger:- ");
      System.out.println("Using Math.pow(): " + Math.pow(x,2));
      System.out.println("Using Math.abs(): " + Math.abs(x));

      System.out.println("\nDeciaml:- ");
      System.out.println("Using Math.pow(): " + Math.pow(y,2));
      System.out.println("Using Math.abs(): " + Math.abs(y));

      sc.close();
    }
     }

       
