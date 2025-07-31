import java.util.Scanner;
public class A3 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num1 , num2, result;
       System.out.print("enter a two number:");
        num1 = rd.nextInt();
        num2 = rd.nextInt();
        result = num1/num2;
        System.out.println("devision:" + result);
        rd.close();
  }
 }
