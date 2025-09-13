import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter a two number: ");
        int a = rd.nextInt();
        int b = rd.nextInt();
        int hcf = findHCF(a, b);
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
        rd.close();
    }
     public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}