 import java.util.*;
public class A9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Cubic values:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + "^3 = " + (arr[i]*arr[i]*arr[i]));
        }
    }
}

