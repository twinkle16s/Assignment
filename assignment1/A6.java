import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = rd.nextFloat();

        float area = (float) (Math.PI * r * r);
        float perimeter =  (float) (2 * Math.PI * r);

         System.out.printf("Area of the circle : %.2f \n ", area);
        System.out.printf("Perimeter of the circle : %,2f ", perimeter);
        rd.close();
    }
}
