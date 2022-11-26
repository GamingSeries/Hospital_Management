/**
 * @author Muneeb Farooq
 * @version openJDK 17.0.3
 * @since openJDK 17.0.3
 */
public class Test001 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Appointment appointment_1 = new Appointment();
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println("\t Original Appointment \t ");
        System.out.println("_____________________________________________________________");
        System.out.println(appointment_1);
        Appointment appointment_2 = new Appointment(appointment_1);
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println("\t Shallow Copied Appointment \t ");
        System.out.println("_____________________________________________________________");
        System.out.println(appointment_2);

        System.out.println("_____________________________________________________________");
        System.out.println("\t\t Default Constructor");
        System.out.println("_____________________________________________________________");

        Appointment def_app = new Appointment();
        System.out.println(def_app);

        System.out.println("_____________________________________________________________");
        System.out.println("\t\t Parameterized Constructor");
        System.out.println("_____________________________________________________________");

        Date date_1 = new Date(13, 5, 2022);
        Time time_1 = new Time(15, 40);
        Consultation_Room room_1 = new Consultation_Room('A', 2, 202);
        Appointment para_app = new Appointment("A101", "P110", "P120",
                "Fever", "Panadol", date_1, time_1, room_1);

        System.out.println(para_app);

        System.out.println("_____________________________________________________________");
        System.out.println("\t\t Setter Method");
        System.out.println("_____________________________________________________________");
        Date date_2 = new Date(13, 30, 2022);
        Time time_2 = new Time(12, 30);
        Consultation_Room room_2 = new Consultation_Room('B', 3, 301);
        Appointment set_app = new Appointment();
        set_app.setAppointment("A110", "P241", "D410", "Cancer",
                "Operation", date_2, time_2, room_2);
        System.out.println(set_app);

        System.out.println("_____________________________________________________________");
        System.out.println("\t\t Getter Method");
        System.out.println("_____________________________________________________________");

        System.out.println("Appointment ID: " + set_app.getAppointment_id());
        System.out.println("Patient ID: " + set_app.getPatient_id());
        System.out.println("Doctor ID: " + set_app.getDoctor_id());
        System.out.println("Reason: " + set_app.getReason());
        System.out.println("Medication: " + set_app.getMedication());
        System.out.println("Date: " + set_app.getDate());
        System.out.println("Time: " + set_app.getTime());
        System.out.println("Room: " + set_app.getConsultR());

    }
}