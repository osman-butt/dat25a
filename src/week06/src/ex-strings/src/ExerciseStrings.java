public class ExerciseStrings {
    public static void main(String[] args) {

        // ============================================================

        // Ex 2.1
        System.out.println("\n----- Ex 2.1 -----");

        String str21 = "This is a string";
        System.out.println("Length of the string is: " + str21.length());

        // ============================================================

        // Ex 2.2
        System.out.println("\n----- Ex 2.2 -----");

        System.out.println("String with upper case letters only: " + str21.toUpperCase());
        System.out.println("String with lower case letters only: " + str21.toLowerCase());

        // ============================================================

        // Ex 2.3
        System.out.println("\n----- Ex 2.3 -----");

        String str23 = "I dont know how to program in Java";
        System.out.println(str23.replace("dont","do"));

        // ============================================================

        // Ex 2.4
        System.out.println("\n----- Ex 2.4 -----");

        String myStr = "Java programming";
        for (int i = 0; i < myStr.length(); i++) {
            System.out.println("Character at position " + i + " is " + myStr.charAt(i));
        }

        // ============================================================

        // Ex 2.5
        System.out.println("\n----- Ex 2.5 -----");

        String str25 = "HELLO WORLD";
        String reversed = "";

        for (int i = str25.length()-1; i >=0; i--) {
            reversed += str25.charAt(i);
        }
        System.out.println("The string in reversed form: " + reversed); // output: DLROW OLLEH

        // ============================================================

        // Ex 2.6
        System.out.println("\n----- Ex 2.6 -----");

        String str26 = "Java isn't that bad at all.";

        // Find fx that start position
        System.out.println("The word \"that\" is found at position: " + str26.indexOf("that"));

        // Find ud af om python findes i strengen
        System.out.println("Is the word \"python\" contained in the string: " + str26.contains("python"));

        // ============================================================

        // Ex 2.7
        System.out.println("\n----- Ex 2.7 -----");

        String str27 = "Was it a car or a cat I saw?";
        System.out.println(str27.substring(9, 12));

        // ============================================================

        // Ex 2.8
        System.out.println("\n----- Ex 2.8 -----");

        String fullName = "John Doe";

        // a + b
        String firstNameInitial = fullName.substring(0,1);
        int indexOfSpace = fullName.indexOf(" ");
        int indexOfLastNameInitial = indexOfSpace + 1;
        String lastNameInitial = fullName.substring(indexOfLastNameInitial,indexOfLastNameInitial+1);
        System.out.println(firstNameInitial + lastNameInitial);

        // c
        String fullName2 = "    jOhN    doE     ";
        String fullNameTrimmedUpperCase = fullName2.trim().toUpperCase();

        // Find first initial
        String firstNameInitial2 = fullNameTrimmedUpperCase.substring(0,1);

        // Find index of last name initial
        int indexOfSpace2 =fullNameTrimmedUpperCase.lastIndexOf(" ");
        int indexOfLastNameInitial2 = indexOfSpace2 + 1;

        // Find last name initial
        String lastNameInitial2 = fullNameTrimmedUpperCase.substring(indexOfLastNameInitial2,indexOfLastNameInitial2+1);

        // Print initials
        System.out.println(firstNameInitial2 + lastNameInitial2);
    }
}