public class Test002 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Appointment appointment_1 = new Appointment();
        Consultation_Room room = new Consultation_Room();
        Date date = new Date();
        Time time = new Time();
        
        
        appointment_1.setAppointment("P01", "DO1", "Allergies", date, time, room);
        room.setConsultR('B', 2, 205);
        date.setDate(17, 3, 2007);
        time.setTime(15, 30);


        System.out.println("Appointment Details: " + appointment_1);
        System.out.println("Room Number: " + room);
        System.out.println("Appointment Date: " + date);
        System.out.println("Appointment Time: " + time);

        Appointment appointment_2 = (Appointment) appointment_1.clone();
        System.out.println("First Object: " + appointment_1);
        System.out.println("First Object 2: " + appointment_2);
    }
}
