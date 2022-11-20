/**
 * @author Muneeb Farooq
 * @version openJDK 17.0.3
 * @since openJDK 17.0.3
 */
public class Test002 {
    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date_1 = new Date(13, 12, 2022);
        Time time_1 = new Time(15, 50);
        Consultation_Room room_1 = new Consultation_Room('A', 3, 302);

        Appointment app_1 = new Appointment();
        app_1.setAppointment("A215", "P220", "D214", "Cancer", "Operation", date_1, time_1, room_1);

        Appointment app_2 = (Appointment) app_1.clone();
        System.out.println("____________________________________________");
        System.out.println("Appointment 1");
        System.out.println(app_1);
        System.out.println("____________________________________________");
        System.out.println("Cloned Appointment");
        System.out.println(app_2);

        Date date_2 = new Date(1, 5,2020);
        Time time_2 = new Time(12, 15);
        Consultation_Room room_2 = new Consultation_Room('B', 2, 205);
        app_1.setAppointment("A400", "P500", "D200", "Mental Illness", "Therapy", date_2, time_2, room_2);

        System.out.println();
        System.out.println("____________________________________________");
        System.out.println("Changing Appointment 1");
        System.out.println(app_1);

        System.out.println();
        System.out.println("____________________________________________");
        System.out.println("Printing the cloned Appointment Again");
        System.out.println(app_2);

    }
}
