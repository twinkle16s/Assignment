import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = rd.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter  numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt();
        }
        System.out.println("Reverse Array elements are:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
