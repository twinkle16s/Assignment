public class A24 {
    public static void main(String[] args) {
        String s = "abc";
        String res = "";
        for(char ch : s.toCharArray()){
            res += "" + ch + ch;
        }
        System.out.println(res);
    }
}
