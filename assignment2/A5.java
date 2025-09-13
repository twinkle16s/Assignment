import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = rd.nextInt();

        System.out.print("Enter exponent (non-negative): ");
        int exponent = rd.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exponent + " = " + result);
    }
}

