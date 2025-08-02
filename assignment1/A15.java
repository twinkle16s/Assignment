import java.util.Scanner;

class A15 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int year;
        System.out.print("Enter a year:");
        year = rd.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("29 days (leap year)");
        } else {
            System.out.println("28 days(Not a leap Y)");
        }

        rd.close();
    }
}
