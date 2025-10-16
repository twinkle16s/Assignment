import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int positive = 0, negative = 0, zeros = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = rd.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}
