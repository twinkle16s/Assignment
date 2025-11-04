public class A13 {
    public static void main(String[] args) {
        String str = "ABC";
        byte[] arr = str.getBytes();
        for (byte b : arr) {
            System.out.println(b);
        }
    }
}
