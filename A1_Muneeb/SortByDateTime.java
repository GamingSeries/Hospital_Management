import java.util.Comparator;

import java.util.Comparator;
public class SortByDateTime implements Comparator<Appointment>{

    @Override
    public int compare(Appointment o1, Appointment o2) {
        return o1.getDate().compareTo(o2.getTime());
    }
    
}
