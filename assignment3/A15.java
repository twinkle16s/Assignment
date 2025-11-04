import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
         int[] arr = {10, 25, 30, 45, 50};
         Scanner rd = new Scanner(System.in);
            System.out.print("Enter a number to search: ");
            int key = rd.nextInt();
            boolean found = false;
            for(int num:arr){
                if(num == key){
                    found = true;
                    break; 
                }
            }
            if(found){
                System.out.println(key + " is found in the array.");
            }else{
                System.out.println(key + " is not found in the array.");
            }
         }
}
