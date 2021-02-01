public class DefangIPAddress {
    public static void main(String[] args) {
        System.out.println(defang("1.2.3.4.5"));
    }

    public static String defang(String arg) {
        return arg.replace(".","[.]");
    }
}
