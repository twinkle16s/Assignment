import java.util.Scanner;
class A13{
    public static void main(String[] args) {
         Scanner rd = new Scanner(System.in);
        int month , year;
        System.out.print("Enter a month (1-12):");
        month = rd.nextInt();
        
        System.out.print("Enter a year:");
         year = rd.nextInt();

         switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 2: 
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 days (leap year)");
                } else {
                    System.out.println("28 days");
                }
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                break;
         }
         rd.close();
    }
}
