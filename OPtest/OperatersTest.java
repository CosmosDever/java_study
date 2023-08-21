package java_study.OPtest;

public class OperatersTest {
    public static void main (String[] args)
    {
    // Initial some value
    int a= 9;
    int b = 9;
    // Addition
    int result_add = a + b;
    System.out.println("Addition Result = " + result_add);
    // Increment result_add (result_add +1)
    ++result_add;
    System.out.println("Increment Result of addition = " + result_add);

    double result_mod = result_add % b;

    System.out.println("Modulus Result = " + result_mod);
        // Add 5 to variable a
    a+=5;
    System.out.println("Result of variable a = " + a);

    // Example: 2 in binary is 10, 1 in binary is 01, 10 | 01 = 11 = 3
    System.out.println("Bitwise of 2 | 1 = " + (2 | 1));
    boolean compare_ab = (a == b);
    System.out.println("Compare a and b = "+ compare_ab);
    boolean logical_ab = (a<5 && b>8);
    System.out.println("Logical a and b ="+ logical_ab);

    }



}
