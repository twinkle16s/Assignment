import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = rd.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
    }
}
