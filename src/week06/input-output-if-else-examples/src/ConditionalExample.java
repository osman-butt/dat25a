import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        // Correct Usernames and passwords
        final String CORRECT_ADMIN_USERNAME = "admin";
        final String CORRECT_ADMIN_PASSWORD = "1234";
        final String CORRECT_EMPLOYEE_USERNAME = "employee";
        final String CORRECT_EMPLOYEE_PASSWORD = "1234";

        // Input fx from keyboard via Scanner
//        String username = "empolyee";
//        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();



        // Check if admin (boolean)
        boolean isAdmin = username.equals(CORRECT_ADMIN_USERNAME) && password.equals(CORRECT_ADMIN_PASSWORD);
        // Check if employee (boolean)
        boolean isEmployee = username.equals(CORRECT_EMPLOYEE_USERNAME) && password.equals(CORRECT_EMPLOYEE_PASSWORD);

        // Simple if (check if admin)
//        if (isAdmin) {
//            System.out.println("HELLO ADMIN");
//        }
//
//        // Simple if-else (check if admin else wrong user)
//        if (isAdmin) {
//            System.out.println("HELLO ADMIN");
//        } else {
//            System.out.println("You are not admin!");
//        }

        // Chained if-else (check if admin or employee else wrong user)
//        if (isAdmin) {
//            System.out.println("Hello admin");
//        } else if (isEmployee) {
//            System.out.println("Hello employee");
//        } else {
//            System.out.println("Wrong credentials!");
//        }


        // Nested if-else (Check if logged in (if admin else) else wrong user)
        if (isAdmin || isEmployee) {
            if (isAdmin) {
                System.out.println("Hello admin");
            } else {
                System.out.println("Hello employee");
            }
        } else {
            System.out.println("Wrong credentials!");
        }
    }
}
// TODO:
// - Add if
// - extract logic to booleans
// - Add if-else
// - Add chained with else if
// - Add nested
// - If time add scanner for input