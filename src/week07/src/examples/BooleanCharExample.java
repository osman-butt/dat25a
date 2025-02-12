package examples;

public class BooleanCharExample {
    public static void main(String[] args) {
        // How does Java evaluate 'a' > 'b'?
//        if ('a' > 'b') {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }
        // Show ASCII values
//        int a = 'a';
        // Casting from int to char
//        System.out.println(a);
//        System.out.println((int) 'b');
//        // Assigning values to int from char
//
//        // Show possible values for char
//        for (int i = 0 ; i < 150; i++) {
//            System.out.println((char) i);
//        }

        // Check if string contains valid values from A-Z, a-z and whitespace manually

//        for (int i = 0; i < str.length(); i++) {
//            char iChar = str.charAt(i);
//            boolean isAtoZ = iChar>= 'A' && iChar <= 'Z';
//            boolean isatoz = iChar >= 'a' && iChar <= 'z';
//            boolean isDash = iChar == '-';
//            boolean isNumeric = iChar >= '0' && iChar <= '9';
//
//            boolean isAlphaNumeric = isAtoZ || isatoz || isNumeric;

//            if (!isCharAlphaNumeric(iChar)) {
//                System.out.println(iChar);
//            }

//            System.out.println(str.charAt(i));
//        }
        String str = "This is a string-";
        boolean isAlphaNumeric = isAlphaNumeric(str);
        System.out.println(isAlphaNumeric);

    }
    // Create a method isAlphaNumeric(String str)
    public static boolean isAlphaNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char iChar = str.charAt(i); // ' '
            boolean isAlphaNumeric = isAlphaNumeric(iChar);
            if (!isAlphaNumeric) {
                return false;
            }
        }
        return true;
    }

    // Create a method isCharAlphaNumeric(char ch)
    public static boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch>='A' && ch<= 'Z') || (ch>='0' && ch<='9');
    }
}
