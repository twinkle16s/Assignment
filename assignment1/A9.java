import java.util.Scanner;
public class A9 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two number: ");
        a = rd.nextInt();
        b = rd.nextInt();
        System.out.println("Before Swapping a = " + a + "and b = " + b);
        a = a + b;   
        b = a - b;   
        a = a - b; 
        System.out.println("After Swapping a = " + a + "and b = " + b);
        rd.close();
  }
 }

