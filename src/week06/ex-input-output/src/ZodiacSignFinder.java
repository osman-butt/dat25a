import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String ERROR_MESSAGE = "FEJL - ugyldig måned!";

        System.out.println("Indtast måneden for din fødselsdag:");
        int inputMonth = sc.nextInt();
        while (inputMonth < 0 || inputMonth > 12) {
            System.out.println(ERROR_MESSAGE);
            System.out.println("Indtast måneden for din fødselsdag:");
            inputMonth = sc.nextInt();
        }

        System.out.println("Indtast dagen for din fødselsdag:");
        int inputDayOfMonth = sc.nextInt();
        while (inputDayOfMonth < 0 || inputDayOfMonth > 31) {
            System.out.println(ERROR_MESSAGE);
            System.out.println("Indtast måneden for din fødselsdag:");
            inputDayOfMonth = sc.nextInt();
        }

        // Logic
        /*
        22 december–20 januar      =    Stenbukken
        21. januar–18. februar     =    Vandmanden
        19. februar–20. marts      =    Fiskene
        21. marts–19. april        =    Vædderen
        20. april–21. maj          =    Tyren
        22. maj–21. juni           =    Tvillingerne
        22. juni–22. juli          =    Krebsen
        23. juli–22. august        =    Løven
        23. august–22. september   =    Jomfruen
        23. september–22. oktober  =    Vægten
        23. oktober–22. november   =    Skorpionen
        23. november–21. december  =    Skytten
         */
        String zodiacSign = "";

        if (inputMonth == 1) {
            if (inputDayOfMonth < 21) {
                zodiacSign = "Stenbukken";
            } else {
                zodiacSign = "Vandmanden";
            }
        } else if (inputMonth == 2) {
            if (inputDayOfMonth < 19) {
                zodiacSign = "Vandmanden";
            } else {
                zodiacSign = "Fiskene";
            }
        } else if (inputMonth == 3) {
            if (inputDayOfMonth < 21) {
                zodiacSign = "Fiskene";
            } else {
                zodiacSign = "Vædderen";
            }
        } else if (inputMonth == 4) {
            if (inputDayOfMonth < 20) {
                zodiacSign = "Vædderen";
            } else {
                zodiacSign = "Tyren";
            }
        } else if (inputMonth == 5) {
            if (inputDayOfMonth < 22) {
                zodiacSign = "Tyren";
            } else {
                zodiacSign = "Tvillingerne";
            }
        } else if (inputMonth == 6) {
            if (inputDayOfMonth < 22) {
                zodiacSign = "Tvillingerne";
            } else {
                zodiacSign = "Krebsen";
            }
        } else if (inputMonth == 7) {
            if (inputDayOfMonth < 23) {
                zodiacSign = "Krebsen";
            } else {
                zodiacSign = "Løven";
            }
        } else if (inputMonth == 8) {
            if (inputDayOfMonth < 23) {
                zodiacSign = "Løven";
            } else {
                zodiacSign = "Jomfruen";
            }
        } else if (inputMonth == 9) {
            if (inputDayOfMonth < 23) {
                zodiacSign = "Jomfruen";
            } else {
                zodiacSign = "Vægten";
            }
        } else if (inputMonth == 10) {
            if (inputDayOfMonth < 23) {
                zodiacSign = "Vægten";
            } else {
                zodiacSign = "Skorpionen";
            }
        } else if (inputMonth == 11) {
            if (inputDayOfMonth < 23) {
                zodiacSign = "Skorpionen";
            } else {
                zodiacSign = "Skytten";
            }
        } else if (inputMonth == 12) {
            if (inputDayOfMonth < 22) {
                zodiacSign = "Skytten";
            } else {
                zodiacSign = "Stenbukken";
            }
        }

        System.out.println("Dit stjernetegn er " + zodiacSign);

        sc.close();
    }
}
