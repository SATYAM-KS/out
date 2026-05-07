import java.util.Scanner;
  public class Calculator{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          int a, b, result;
          char op;

          System.out.print("Enter the first number: ");
          a = sc.nextInt();
          System.out.print("Enter the second number: ");
          b = sc.nextInt();

          System.out.print("\nChoose an operator (+. -, *, /): ");
          op = sc.next().charAt(0);

          if(op == '+'){
            result = a+b;
            System.out.println("\nAnswer: " + result);
          }

          else if(op == '-'){
            result = a-b;
            System.out.println("\nAnswer: " + result);
          }

          else if(op == '*'){
            result = a*b;
            System.out.println("\nAnswer: " + result);
          }

          else if(op == '/'){
            result = a/b;
            System.out.println("\nAnswer: " + result);
          }

          else{
            System.out.println("\nInvalid operator entered.");
          }

        sc.close();

      }
  }      
