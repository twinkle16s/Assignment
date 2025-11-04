public class A14 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.intern();
        System.out.println(s1 == s2);
    }
}
