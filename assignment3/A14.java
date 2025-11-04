public class A14 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 8, -7, -2, 10};
        int sum = 0;
        for (int num : arr) {
            if (num < 0) {
                sum += num;
            }
        }
        System.out.println("Sum of negative numbers = " + sum);
    }
}
