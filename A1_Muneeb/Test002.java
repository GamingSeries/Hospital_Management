public class Test002 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        //Cloning Appointment:
        Appointment appointment_1 = new Appointment();
        Appointment appointment_2 = (Appointment) appointment_1.clone();
        System.out.println("Appointment Cloned: " + appointment_2);

        //Cloning Consultation Room:
        Consultation_Room room_1 = new Consultation_Room();
        Consultation_Room room_2 = (Consultation_Room) room_1.clone();
        System.out.println("Consultation Room Cloned: " + room_2);

        //Cloning Date:
        Date date_1 = new Date();
        Date date_2 = (Date) date_1.clone();
        System.out.println("Date Cloned: " + date_2);
        
        //Cloning Time
        Time time_1 = new Time();
        Time time_2 = (Time) time_1.clone();
        System.out.println("Time Cloned: " + time_2);
        
    }
}
