public class A25 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        int sum = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)){
                sum += ch - '0';
            }
        }
        System.out.println(sum);
    }
}
