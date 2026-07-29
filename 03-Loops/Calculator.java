
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till does doesn't not press X or x:
        int ans = 0;       
        while (true){
            // take the operator as input
            System.out.println("Enter the operator (or enter x to exit): ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-'||op == '*'||op == '/'||op == '%' ){
                System.out.println("Enter the two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                } 
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                    ans = num1 / num2;
                    } else{
                        System.out.println("Division by zero not possible");
                        break;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                System.out.println("Ans = " + ans);
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator enter again");
            }
        }
    }
}