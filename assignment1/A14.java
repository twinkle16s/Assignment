import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String text = rd.nextLine();

        if (text.length() != 1) {
            System.out.println("Error: Please enter only one character.");
        } else {
            char ch = text.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        }
        rd.close();
    }
}
