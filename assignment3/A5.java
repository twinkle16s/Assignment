import java.util.Scanner;
public class A5 {
  public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("Enter 5 numbers: ");
    for (int i = 0; i < 5; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println("Array elements are:");
    for (int i = 0; i < 5; i++) {
      System.out.print(arr[i] + " ");
    }}}
