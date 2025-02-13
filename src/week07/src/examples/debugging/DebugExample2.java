package examples.debugging;

public class DebugExample2 {
    public static void main(String[] args) {
        String input = "0123";
        System.out.println("Is it numeric: "+isNumeric(input));
    }
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char iChar = str.charAt(i); // ' '
            boolean isNumeric = isNumeric(iChar);
            if (!isNumeric) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(char ch) {
        return (ch>='0' && ch<='9');
    }
}
