import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast dit navn:");
        String inputName = sc.next();

        System.out.println("Indtast din yndlingsfarve:");
        String inputColor = sc.next();

        System.out.println("Hej " + inputName + ". Din yndlingsfarve er " + inputColor);
        sc.close();
    }
}
