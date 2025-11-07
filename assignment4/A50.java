import java.util.StringTokenizer;

public class A50 {
    public static void main(String[] args) {
        String s = "Java is fun";
        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
