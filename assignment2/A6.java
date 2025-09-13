import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = rd.nextInt();
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);
        rd.close();

    }
}