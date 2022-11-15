/**
 * @author Muneeb Farooq
 * @version openJDL 17.0.3
 * @since openJDK 17.0.3
 */
import java.util.Comparator;

public class SortByDateTime implements Comparator<Appointment> {

    public int compare(Appointment o1, Appointment o2) {
        if (o1.getDate().compareTo(o2.getDate()) == 0) {
            return o1.getTime().compareTo(o2.getTime());
        } else {
            return o1.getDate().compareTo(o2.getDate());
        }
    }

}
