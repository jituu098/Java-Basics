

public class TypeCasting{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // type casting
        int num = (int)(67.56f);
        System.out.println(num);

        // automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a); // 257%
        byte x = 40;
        byte y = 50;
        byte z = 100;
        int r = (x * y)/z;
        System.out.println(r);

        // byte e = 50;
        //  e = e  *2; Throw a error

         int number = 'A';   //ASCI value
         System.out.println(number);

        // Type promotion
        System.out.println(3 * 5.43534523f);

        // summary
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d*s);
        // float + int - double = double
        System.out.println((f * b)  +" "  + (i / c) + " " + (d*s));
        System.out.println(result);
    }
}