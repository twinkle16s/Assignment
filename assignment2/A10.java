import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a ,b , sum ;
        char choice;
        do{
            System.out.println("Enter two integers: ");
            a = rd.nextInt();
            b = rd.nextInt();
            sum = a + b;
            System.out.println("Sum = " + sum);
            System.out.print("Do you want to continue (Y/N)? ");
           choice = rd.next().charAt(0);
          } while(choice == 'Y' || choice == 'y');
         System.out.println("Program ended.");
    } 
}
