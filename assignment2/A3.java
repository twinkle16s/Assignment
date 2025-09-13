import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int i, num, mult;
        System.out.print("Enter a positive integer: ");
        num = rd.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Multiplication Table of " + num + ":");
            for (i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

    }
}
