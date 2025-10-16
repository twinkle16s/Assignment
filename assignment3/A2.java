import java.util.Arrays;
class A2{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr); // First ascending
        System.out.print("Descending Order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
