public class Tid {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 34;
        int second = 0;

        // Print
        System.out.println("Time: "+hour);
        System.out.println("Minut: "+minute);
        System.out.println("Sekund: "+second);

        // Declared as final as they are constants
        final int MINUTS_IN_SECONDS = 60;
        final int HOURS_IN_SECONDS = 60 * MINUTS_IN_SECONDS;

        // Start time in seconds
        int startInSeconds =hour*HOURS_IN_SECONDS+minute*MINUTS_IN_SECONDS+second;
        System.out.println("Siden midnat er der gået "+startInSeconds+" sekunder");

        // Declared as final as they are constants
        final int HOURS_PER_DAY = 24;
        final int SECONDS_PER_DAY = HOURS_PER_DAY*HOURS_IN_SECONDS;

        System.out.println("Der er "+(SECONDS_PER_DAY-startInSeconds)+" sekunder tilbage af i dag");

        // End time
        int endHour = 15;
        int endMinute = 43;
        int endSecond = 0;
        int endInSeconds = endHour*HOURS_IN_SECONDS + endMinute*MINUTS_IN_SECONDS+endSecond;

        // duration
        int duration = endInSeconds - startInSeconds;
        System.out.println("Der er gået "+duration+" sekunder på at lave opgaven!");


    }
}
