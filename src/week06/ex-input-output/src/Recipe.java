import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hvor mange cookies ønsker du at bage?");
        int numberOfCookies = sc.nextInt();

        System.out.println("Hvor meget mel skal der bruges pr cookie i gram?");
        int flourPerCookie = sc.nextInt();

        System.out.println("For at lave " + numberOfCookies + " skal du bruge " + (numberOfCookies*flourPerCookie));

        sc.close();
    }
}
