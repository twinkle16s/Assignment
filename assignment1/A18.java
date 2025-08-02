import java.util.Scanner;
class A18 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
       int physics, chemistry, biology, math, computer;

            System.out.println("Enter marks for Physics, Chemistry, Biology, Mathematics, Computer:");
            physics = rd.nextInt();
            chemistry = rd.nextInt();
            biology = rd.nextInt();
            math = rd.nextInt();
            computer = rd.nextInt();

           int total = physics + chemistry + biology + math + computer;
            float percentage = total / 5.0f;
            System.out.println("Percentage: " + percentage + "%");
            char grade;
            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 80)
                grade = 'B';
            else if (percentage >= 70)
                grade = 'C';
            else if (percentage >= 60)
                grade = 'D';
            else if (percentage >= 40)
                grade = 'E';
            else
                grade = 'F';

            System.out.println("Grade: " + grade);
            rd.close();
        }
    }


      




        
        

