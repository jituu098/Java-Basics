
import java.util.Scanner;

public class  RsToUsd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency in ruppes: ");
        int rs = input.nextInt();
        Float usd = (float)(rs * 0.010);
        System.out.println(rs + " in USD is : " + usd);
    }
}