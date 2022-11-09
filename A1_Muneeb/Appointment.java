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
        Date d = new Date(12, 1, 2022);
        Time t = new Time(15, 30);
        Consultation_Room r = new Consultation_Room('B', 2,205 );

        date = d;
        time = t;
        room = r;
    }

    //Parameterized Constructor:
    Appointment(String appointment_id, String patient_id, String doctor_id, String reason, 
    String medication, Date date, Time time, Consultation_Room room)
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
    public void setAppointment(String appointment_id, String patient_id, String doctor_id, String reason,String medication,  Date date_1, Time time, Consultation_Room room)
    {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.medication = medication;
        this.date = date_1;
        this.time = time;
        this.room = room;
    }

    //Copy Contructor
    Appointment(Appointment c_Appointment)
    {
        appointment_id = c_Appointment.appointment_id;
        patient_id = c_Appointment.patient_id;
        doctor_id = c_Appointment.doctor_id;
        reason = c_Appointment.reason;
        medication = c_Appointment.medication;
        date = c_Appointment.date;
        time = c_Appointment.time;
        room = c_Appointment.room;
    }


    
    //Getter method:
    public String getAppointment_id()
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
    public String getMedication()
    {
        return medication;
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
    //String Format:
    public String toString()
    {
        return "Appointment ID: " + appointment_id + "\nPaitent ID: " + patient_id + "\nDoctor ID: " + doctor_id 
        + "\nReason: " + reason + "  \nMedication: " + medication + "\nDate: " + date + "\nTime: " 
        + time + "\n- - - - - - - - " + " Room " + "- - - - - - - -  " + room;
    }

    @Override
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
