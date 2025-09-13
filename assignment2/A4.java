import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int i, num,fact=1 ;
        System.out.print("Enter a number: ");
        num = rd.nextInt();
        for(i=1; i<=num; i++) {
            fact *= i;
    }
        System.out.println("Factorial of " + num + " is: " + fact);
        rd.close();
    }
}
