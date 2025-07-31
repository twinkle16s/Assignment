import java.util.Scanner;
public class A5 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b, multi, sub , sum , divide, rem;
        System.out.print("Enter first number: ");
        a = rd.nextInt();
        System.out.print("Enter second number: ");
        b = rd.nextInt();
        sum = a + b;
        sub = a - b;
        multi = a*b;
        divide = a/b;
        rem = a%b;
        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("multi: " + multi);
        System.out.println("divide: " + divide);
        System.out.println("remainder: " + rem);
        rd.close();
  }
 }
