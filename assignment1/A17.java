import java.util.Scanner;

public class A17{
     public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = rd.nextInt();

        if(num % 2== 0){
            System.out.print("Number is Even");
        }
        else{
            System.out.print("Number is Odd");
        }
        rd.close();
  }
}