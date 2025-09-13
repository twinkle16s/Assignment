import java.util.Scanner;

class A7{
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter a numbe: ");
        int n = rd.nextInt();

        int evenSum = 0, oddSum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = rd.nextInt();

            if (num % 2 == 0) {   
                evenSum += num;
            } else {              
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers  = " + oddSum);

    }
}
