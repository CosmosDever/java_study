package java_study.lab1;

public class U2_1 {
    public static void main(String[] args) {
        // Increment and decrement operators
        int x = 5;
        System.out.println("Initial x: " + x);
        
        int y = x++; // Post-increment
        System.out.println("Post-increment: y = " + y + ", x = " + x);
        
        int z = ++x; // Pre-increment
        System.out.println("Pre-increment: z = " + z + ", x = " + x);
        
        int a = x--; // Post-decrement
        System.out.println("Post-decrement: a = " + a + ", x = " + x);
        
        int b = --x; // Pre-decrement
        System.out.println("Pre-decrement: b = " + b + ", x = " + x);
        
        // Arithmetic operators
        int num1 = 10, num2 = 3;
        System.out.println("Arithmetic operators:");
        System.out.println("num1 + num2: " + (num1 + num2));
        System.out.println("num1 - num2: " + (num1 - num2));
        System.out.println("num1 * num2: " + (num1 * num2));
        System.out.println("num1 / num2: " + (num1 / num2));
        System.out.println("num1 % num2: " + (num1 % num2));
        
        // Relational operators
        int value1 = 5, value2 = 8;
        System.out.println("Relational operators:");
        System.out.println("value1 < value2: " + (value1 < value2));
        System.out.println("value1 > value2: " + (value1 > value2));
        System.out.println("value1 <= value2: " + (value1 <= value2));
        System.out.println("value1 >= value2: " + (value1 >= value2));
        System.out.println("value1 == value2: " + (value1 == value2));
        System.out.println("value1 != value2: " + (value1 != value2));
        
        // Conditional operator
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Conditional operator: " + number + " is " + result);
    }
}
