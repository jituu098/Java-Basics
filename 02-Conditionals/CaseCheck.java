
import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String word = "hello";
        // System.out.println(word.charAt(0));        
        // trim() remove the extra spaces
        // CharAt(0) gives the char at index 0

        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Upper case");
        }
    }
}