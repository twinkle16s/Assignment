public class A10{
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        String vendor = System.getProperty("java.vendor");
        String home = System.getProperty("java.home");

        System.out.println("Java is installed on your system.");
        System.out.println("Java Version: " + version);
        System.out.println("Java Vendor: " + vendor);
        System.out.println("Java Home: " + home);
    }
}
