import java.util.Comparator;
public class Appointment implements Comparable<Appointment>, Cloneable
{
    //Creating Atributes
    private String appointment_id;
    private String patient_id; //Patient registration number
    private String doctor_id;  //Doctor ID
    private String reason;  //Reason of visit
    private String medication; //Suggested medication
    private Date date;  //Date of appointment
    private Time time;  //time of appointment
    private Consultation_Room room; //Consultation room

    //No Parameterized Constructor:
    Appointment()
    {
        appointment_id = "A001";
        patient_id = "P001";
        doctor_id = "D001";
        reason = "Allergies";
        medication = "Clarinite";
        Date date = new Date();
        date = date;
        Time time = new Time();
        time = time;
        Consultation_Room room = new Consultation_Room();
        room = room;

    }

    //Parameterized Constructor:
    Appointment(String appointment_id, String patient_id, String doctor_id, String reason, String medication, Date date, Time time, Consultation_Room room)
    {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.medication = medication;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    //Setter Method
    public void setAppointment(String appointment_id, String patient_id, String doctor_id, String reason, Date date, Time time, Consultation_Room room)
    {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    //Getter method:
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
        return room;
    }
    //Convert to String 
    public String toString()
    {
        return appointment_id + " " + patient_id + " " + doctor_id + " " + reason + "  " + medication;
    }

    //Copy Contructor
    Appointment(Appointment c_Appointment)
    { 
        patient_id = c_Appointment.patient_id;
        doctor_id = c_Appointment.doctor_id;
        reason = c_Appointment.reason;
        medication = c_Appointment.medication;
        
    }

    //CompareTo method

    public int compareTo(Appointment a)
    {
        return this.appointment_id.compareTo(a.appointment_id);
    }

    //Object Cloning:
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}