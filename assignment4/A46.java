public class A46 {
    public static void main(String[] args) {
        String s = "java programming language";
        String words[] = s.split(" ");
        String result = "";

        for(String w : words){
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        System.out.println(result);
    }
}
