public class A4 {
    public static void main(String[] args) {
        String s = "hello";
        int count = s.codePointCount(0, s.length());
        System.out.println(count);
    }
}
