import java.util.Scanner;
public class A4 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b, product;
        System.out.print("Enter first number: ");
        a = rd.nextInt();
        System.out.print("Enter second number: ");
        b = rd.nextInt();
        product = a * b;
        System.out.println("Product: " + product);
        rd.close();
  }
 }
