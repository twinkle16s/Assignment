public class A31 {
    public static void main(String[] args) {
        String s = "ababbcaabb";
        for(int  i= 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println("First non-repeating character: " + ch);
                break;
            

        }
    }
}
}