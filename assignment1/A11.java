import java.util.Scanner;
public class A11 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num ;
        System.out.print("Enter a number: ");
        num = rd.nextInt();

        if(num < 0){
             System.out.print("the number is negative ");
        }
        else{
            System.out.print("the number is positive ");
        }
        rd.close();
  }
 }
