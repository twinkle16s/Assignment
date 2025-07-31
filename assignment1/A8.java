import java.util.Scanner;
public class A8 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter two number: ");
        a = rd.nextInt();
        b = rd.nextInt();
        System.out.println("Before Swapping a = " + a + "and b = " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = " + a + "and b = " + b);
        rd.close();
  }
 }

