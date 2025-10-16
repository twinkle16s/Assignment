import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = rd.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
