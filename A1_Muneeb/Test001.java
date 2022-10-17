public class Test001 {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        Consultation_Room room = new Consultation_Room();
        Date date = new Date();
        Time time = new Time();
        
        
        appointment.setAppointment("P01", "DO1", "Allergies", date, time, room);
        room.setConsultR('B', 2, 205);
        date.setDate(17, 3, 2007);
        time.setTime(15, 30);

        System.out.println("Appointment Details: " + appointment);
        System.out.println("Room Number: " + room);
        System.out.println("Appointment Date: " + date);
        System.out.println("Appointment Time: " + time);
    }
}
