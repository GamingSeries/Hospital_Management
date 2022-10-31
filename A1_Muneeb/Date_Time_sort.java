import java.util.Comparator;

public class Date_Time_sort implements Comparator<Appointment>
{
    Date date = new Date();
    Time time = new Time();

    public int DateTimeCompare(Appointment a1, Appointment a2)
    {
        date.setDate(3,  11, 2012);
        date.setDate(12, 8, 2022);
        date.setDate(23, 2, 2022);
        date.setDate(12, 6, 2022);
        date.setDate(5,  3, 2022);
        date.setDate(11, 6, 2022);
        date.setDate(12, 3, 2022);
        date.setDate(21, 4, 2022);
        date.setDate(2,  2, 2022);

        return a1.getDate().CompareTo(a2.getTime());
    }

    @Override
    public int compare(Appointment a1, Appointment a2) {
        // TODO Auto-generated method stub
        return 0;
    }
}
