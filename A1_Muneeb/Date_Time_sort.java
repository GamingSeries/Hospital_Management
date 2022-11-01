import java.util.Comparator;

public class Date_Time_sort implements Comparator<Appointment>
{
    public int compare(Appointment a1, Appointment a2)
    {
        return a1.getDate().CompareTo(a2.getTime());
    }
}
