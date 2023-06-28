package src;

import java.util.Comparator;
import Entidades.Hoteles;

public class HotelComparator implements Comparator<Hoteles> {

    @Override
    public int compare(Hoteles hotel1, Hoteles hotel2){

        return hotel1.getPrecioHabitacion() - hotel2.getPrecioHabitacion();

    }
    
}
