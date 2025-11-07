public class A40 {
    public static void main(String[] args) {
        String s = "JaVa ProGram";
        int upper = 0, lower = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                upper++;
            else if (Character.isLowerCase(c))
                lower++;
        }

        System.out.println("String: " + s);
        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Lowercase Letters: " + lower);
    }
}
