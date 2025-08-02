import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = rd.nextDouble();
        double hra, da, gross;
        if (basic < 1500) {
            hra = 0.10 * basic;
            da = 0.90 * basic;
        } else {
            hra = 500;
            da = 0.98 * basic;
        }
        gross = basic + hra + da;
        System.out.println("Gross Salary = Rs. " + gross);
        rd.close();
    }
}
