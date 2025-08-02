import java.util.Scanner;
public class A16 {
        public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = rd.nextInt();
        if(num % 5 == 0){
               System.out.println("Number is divisible by 5 ");
        }else if(num % 11 == 0){
               System.out.print("Number is divisible by 11 ");
        }
        else{
           System.out.print("Incorrect Number");
        }
      rd.close();   
  }

 }
