package examples.sort.hotel;

import java.util.Comparator;

public class HotelCityComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
