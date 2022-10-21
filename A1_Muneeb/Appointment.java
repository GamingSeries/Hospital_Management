public class Appointment implements Cloneable
{
    private String appointment_id;
    private String patient_id; //Patient registration number
    private String doctor_id;  //Doctor ID
    private String reason;  //Reason of visit
    private String medication; //Suggested medication
    private Date date;  //Date of appointment
    private Time time;  //time of appointment
    private Consultation_Room consultation_room; //Consultation room

    //No Parameterized Constructor:
    Appointment(){
        appointment_id = "A001";
        patient_id = "P001";
        doctor_id = "D001";
        reason = "Allergies";
        medication = "Clarinite";
    }

    //Parameterized Constructor:
    Appointment(String appointment_id, String patient_id, String doctor_id, String reason, String medication, Date date, Time time, Consultation_Room room)
    {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.medication = medication;
        
    }

    //Copy Contructor
    Appointment(Appointment c_Appointment)
    {
        appointment_id = c_Appointment.appointment_id;
        patient_id = c_Appointment.patient_id;
        doctor_id = c_Appointment.doctor_id;
        reason = c_Appointment.reason;
        medication = c_Appointment.medication;
    }

    //Setter Method
    public void setAppointment(String patient_id, String doctor_id, String reason, Date date, Time time, Consultation_Room room)
    {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.consultation_room = room;
    }

    //Getter method:
    public  String getAppointment_id()
    {
        return appointment_id;
    }
    public String getPatient_id()
    {
        return patient_id;
    }
    public String getDoctor_id()
    {
        return doctor_id;
    }
    public String getReason()
    {
        return reason;
    }
    public Date getDate()
    {
        return date;
    }
    public Time getTime()
    {
        return time;
    }
    public Consultation_Room getConsultR()
    {
        return consultation_room;
    }
    //Convert to String 
    public String toString()
    {
        return appointment_id+ " " + patient_id + " " + doctor_id + " " + reason + "  " + medication;
    }

    //Object Cloning:
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}