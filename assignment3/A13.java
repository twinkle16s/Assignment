public class A13 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int num : arr) {
            sum += num * num * num; 
        }
        System.out.println("Sum of cubic values = " + sum);
    }
}
