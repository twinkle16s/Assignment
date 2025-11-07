import java.text.Collator;
import java.util.Locale;

class A44 {
    public static void main(String[] args) {
        Collator col = Collator.getInstance(Locale.ENGLISH);
        System.out.println(col.compare("apple", "banana"));
        System.out.println("apple".compareTo("banana"));
    }
}
