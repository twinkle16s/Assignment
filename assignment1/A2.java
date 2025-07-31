import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num1 , num2, sum;
       System.out.print("enter a two number:");
        num1 = rd.nextInt();
        num2 = rd.nextInt();
        sum = num1 + num2;
        System.out.println("sum:" + sum);
        rd.close();
  }
 }
