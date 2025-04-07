package examples.hotel;

import java.util.Comparator;

public class HotelComparator {
    public static Comparator<Hotel> sortByName() {
//        return new Comparator<Hotel>() {
//            @Override
//            public int compare(Hotel o1, Hotel o2) {
//                return o1.getCity().compareTo(o2.getCity());
//            }
//        };
        return new HotelNameComparator();
    }

    public static Comparator<Hotel> sortByCity() {
        return new HotelCityComparator();
    }
    public static Comparator<Hotel> sortByPrice() {
        return new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                return Double.compare(o1.getBasePrice(),o2.getBasePrice());
            }
        };
    }
}
