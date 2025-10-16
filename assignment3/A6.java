import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
           System.out.print("Enter the size of the array: ");
          int size = rd.nextInt();
         int arr[] = new int[size];
         System.out.println("The size of the array is: " + arr.length);
    }
}
