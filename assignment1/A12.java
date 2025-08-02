import java.util.Scanner;

class A12 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Enter three numbers: ");
        a = rd.nextInt();
        b = rd.nextInt();
        c = rd.nextInt();

            if(a>b && a>c){
                System.out.printf("%d is greater than %d and %d\n",a,b,c);
            }
            else if(b>a && b>c){
                System.out.printf("%d is greater than %d and %d\n",b,a,c);
            }
            else{
                System.out.printf("%d is greater than %d and %d\n",c,a,b);
            }
     rd.close();
    }
}



