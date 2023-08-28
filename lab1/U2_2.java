package java_study.lab1;

public class U2_2 {
    public static void main(String[] args) {
        // If statement
        int num1 = 25, num2 = 30;
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
            System.out.println("The lesser number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num2);
            System.out.println("The lesser number is: " + num1);
        }

        // Switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // For loop
        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            totalSum += i;
        }
        System.out.println("Total sum using for loop: " + totalSum);

        // While loop
        int i = 0;
        while (i <= 5) {
            System.out.println("Value of i: " + (i + 1));
            i++;
        }

        // Do-while loop
        int j = 1;
        do {
            System.out.println("Inside the loop, j = " + j);
            if (j > 5) {
                break;
            }
            j++;
        } while (true);
    }
}
