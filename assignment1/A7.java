import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b, c;
        float avg;

        System.out.print("Enter three numbers: ");
        a = rd.nextInt();
        b = rd.nextInt();
        c = rd.nextInt();

        avg = (a + b + c) / 3.0f; 
        System.out.printf("Average: %.2f ", avg);
        rd.close();
    }
}

