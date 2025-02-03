public class ExerciseLoops {
    public static void main(String[] args) {

        // Ex 1.1 - Print "Hello World"  ud 3 gange
        System.out.println("----- Ex 1.1 -----");
        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }

        // while
        int i1 = 0;
        while (i1 < 3) {
            System.out.println("Hello World");
            ++i1;
        }

        // Vi kan bruge loops til at skrive mindre kode!


        // ============================================================

        // Ex 1.2 - Brug et loop til at printe alle tal fra 1 til 10
        System.out.println("\n----- Ex 1.2 -----");

        // For loop
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        // while loop
        int i2 = 1;
        while (i2 <= 10) {
            System.out.println(i2);
            ++i2;
        }

        // ============================================================

        // Ex 1.3 - Brug et loop til at printe tegnet 'e'  10 gange
        System.out.println("\n----- Ex 1.3 -----");
        char eChar = 'e';
        for (int i = 1; i<=10; i++) {
            System.out.println(eChar);
        }


        // ============================================================

        // Ex 1.4 - Brug et loop til at printe tallene fra 5 til -5
        System.out.println("\n----- Ex 1.4 -----");

        // for loop
        for (int i = 5; i>=-5; i--) {
            System.out.println(i);
        }

        // while loop
        int i4 = 5;
        while(i4>=-5) {
            System.out.println(i4);
            --i4;
        }

        // ============================================================

        // Ex 1.5  - Brug et loop til at printe hvert 3. tal fra 5 til 30
        System.out.println("\n----- Ex 1.5 -----");

        // for loop
        for (int i = 5; i<=30; i += 3) {
            System.out.println(i);
        }

        // while loop
        int i5 = 5;
        while(i5<=30) {
            System.out.println(i5);
            i5 += 3;
        }

        // ============================================================

        // Ex 1.6  - Countdown:
        System.out.println("\n----- Ex 1.6 -----");
        int count = 10;

        while (count > 0) {
            System.out.println("Countdown: " + count);
            --count; // Dette er den eneste ændring
        }
        System.out.println("Finished running loop!");


        // ============================================================

        // Ex 1.7  - Summere alle tal fra 1 til 10 (1+2+3+...+9+10 = 55):
        System.out.println("\n----- Ex 1.7 -----");

        int count17 = 0; // bemærk: var-navn ændret, grundet konflikt med count fra Ex 1.6
        int sum = 0;

        do {
            System.out.println("Currrent count is " + count17);
            sum += count17;
            System.out.println("Currrent sum is " + sum);
            count17++;
        } while(count17 <= 10);

        // ============================================================

        // Ex 1.8  - Skriv for-loops der skriver følgende talrækker ud i terminalen (et loop pr talrække):
        System.out.println("\n----- Ex 1.8 -----");

        // a) 2 4 6 8 10 12
        System.out.println("----- Ex 1.8a -----");
        for (int i = 2; i<=12; i += 2) {
            System.out.println(i);
        }

        // b) 4 19 34 49 64 79
        System.out.println("----- Ex 1.8b -----");
        for (int i = 4; i<=79; i += 15) {
            System.out.println(i);
        }

        // c) 30 20 10 0 -10 -20
        System.out.println("----- Ex 1.8c -----");
        for (int i = 30; i>=-20; i -= 10) {
            System.out.println(i);
        }

        // d) -7 -3 1 5 9 13
        System.out.println("----- Ex 1.8d -----");
        for (int i = -7; i<=13; i += 4) {
            System.out.println(i);
        }

        // e) 97 94 91 88 85 82
        System.out.println("----- Ex 1.8e -----");
        for (int i = 97; i >= 82; i -= 3) {
            System.out.println(i);
        }

        // ============================================================

        // Ex 1.8  - nested for-loop:
        System.out.println("\n----- Ex 1.8 -----");

        // 1.8b) System.out.println() bliver kaldt 6 (=3*2) gange i alt

        // 1.8d)
        for (int i = 3; i >= 0; i--) { // Ydre loop
            for (int j = 0; j <= 2; j++) { // Indre loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}