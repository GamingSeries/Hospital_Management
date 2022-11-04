import Draft_Test.Date;

public class Test002 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Date date_1 = new Date(13,12,2022);
        Time time_1 = new Time(15, 50) ;
        Consultation_Room room_1 = new Consultation_Room('A', 3, 302);

        Appointment app_1 = new Appointment();
        app_1.setAppointment("A215", "P220", "D214", "Cancer", date_1, time_1, room_1);

        Appointment app_2 = (Appointment) app_1.clone();
        System.out.println("____________________________________________");
        System.out.println("Appointment 1");
        System.out.println(app_1);
        System.out.println("____________________________________________");
        System.out.println("Cloned Appointment");
        System.out.println(app_2);

    }
}
