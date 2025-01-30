public class Dato {
    public static void main(String[] args) {
        int year = 2025;
        String month = "January";
        int date = 30;
        String day = "Thursday";

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);

        // Amerikansk format
        // Friday,  July 16, 2016
        System.out.println(day+", "+month+" " +date + ", "+year);

        // Europæisk format
        // Friday 16 July 2016
        System.out.println(day+", "+date+" " + month + ", "+year);

    }
}
