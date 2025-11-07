public class A29 {
    public static void main(String[] args) {
        String s = "Java Programming";
        String words[] = s.split(" ");
        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }
    }
}
