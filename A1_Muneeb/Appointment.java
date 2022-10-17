public class Appointment
{
    private String patient_id; //Patient registration number
    private String doctor_id;  //Doctor ID
    private String reason;  //Reason of visit
    private String medication; //Suggested medication
    private Date date;  //Date of appointment
    private Time time;  //time of appointment
    private Consultation_Room consultation_room; //Consultation room

    //No Parameterized Constructor:
    Appointment(){
        patient_id = "P001";
        doctor_id = "D001";
        reason = "Allergies";
        medication = "Clarinite";

        System.out.println("Patient ID: " + patient_id);
        System.out.println("Doctor ID: " + doctor_id);
        System.out.println("reason of admit: " + reason);
        System.out.println("medication: " + medication);
    }

    //Parameterized Constructor:
    Appointment(String patient_id, String doctor_id, String reason, String medication, Date date, Time time, Consultation_Room room)
    {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.medication = medication;
        
    }

    //Copy Contructor
    Appointment(Appointment c_Appointment)
    {
        System.out.println("Copy constructor called");

        patient_id = c_Appointment.patient_id;
        doctor_id = c_Appointment.doctor_id;
        reason = c_Appointment.reason;
        medication = c_Appointment.medication;
    }

    //Setter Method
    public void setAppointment(String patient_id, String doctor_id, String reason, Date date, Time time, Consultation_Room room)
    {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.consultation_room = room;
    }

    //Getter method:
    public String getAppointment(String patient_id)
    {
        return patient_id;
    }
    //Convert to String 
    public String toString()
    {
        return patient_id + " " + doctor_id + " " + reason + "  " + medication;
    }

}
//test