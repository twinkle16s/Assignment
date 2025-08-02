import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter total electricity units consumed: ");
        int units = rd.nextInt();
        double bill = 0;
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = (50 * 0.50) + (units - 50) * 0.75;
        } else if (units <= 450) {
            bill = (50 * 0.50) + (150 * 0.75) + (units - 200) * 1.20;
        } else {
            bill = (50 * 0.50) + (150 * 0.75) + (250 * 1.20) + (units - 450) * 1.50;
        }
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        System.out.println("Base Bill: Rs. " + bill);
        System.out.println("Surcharge (20%): Rs. " + surcharge);
        System.out.println("Total Electricity Bill with Surcharge: Rs. " + totalBill);
    }
}
