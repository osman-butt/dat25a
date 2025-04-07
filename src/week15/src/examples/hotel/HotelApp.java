package examples.hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HotelApp {
    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Ocean View", "San Diego", 220.0));
        hotels.add(new Hotel("Mountain Lodge", "Denver", 150.0));
        hotels.add(new Hotel("City Inn", "New York", 180.0));
        hotels.add(new Hotel("Palm Resort", "Miami", 250.0));
        hotels.add(new Hotel("Budget Stay", "Denver", 95.0));

        // Original list
        System.out.println("Original list:");
        printList(hotels);

        // Natural sorting by price
        System.out.println("Sorted by price (Comparable):");
        Collections.sort(hotels);
        printList(hotels);

        // Sort by name - Comparator
        System.out.println("Sorted by name (Comparator):");
//        Collections.sort(hotels, new HotelNameComparator());
        hotels.sort(new HotelNameComparator());
        printList(hotels);


        // Sort by City
        System.out.println("Sorted by city:");
        hotels.sort(HotelComparator.sortByName());
        printList(hotels);

        Comparator<Hotel> priceComparator = new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                return Double.compare(o1.getBasePrice(),o2.getBasePrice());
            }
        };

        // Sort by price using anonymous class
        System.out.println("Sorted by price");
//        hotels.sort(priceComparator);
        hotels.sort(HotelComparator.sortByPrice());
        printList(hotels);



    }

    private static void printList(ArrayList<Hotel> list) {
        System.out.println("--------------------------------------------------");
        for (Hotel h : list) {
            System.out.println(h);
        }
        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}
