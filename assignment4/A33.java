public class A33 {
    public static void main(String[] args) {
        String s = "successes";
        int max = 0;
        char result = ' ';
        
        for(char c : s.toCharArray()){
            int freq = 0;
            for(char x : s.toCharArray())
                if(x == c) freq++;

            if(freq > max){
                max = freq;
                result = c;
            }
        }
        System.out.println(result);
    }
}
