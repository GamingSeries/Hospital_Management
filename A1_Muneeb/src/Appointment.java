package A1_Muneeb;

/**
 * @author Muneeb Farooq
 * @version openJDL 17.0.3
 * @since openJDK 17.0.3
 * 
 */

public class Appointment implements Comparable<Appointment>, Cloneable {
    // Creating Atributes
    private String appointment_id;
    private String patient_id; // Patient registration number
    private String doctor_id; // Doctor ID
    private String reason; // Reason of visit
    private String medication; // Suggested medication
    private Date date; // Date of appointment
    private Time time; // time of appointment
    private Consultation_Room room; // Consultation room

    // No Parameterized Constructor:

    Appointment() {
        appointment_id = "A001"; // APPOINTMENT ID DEFAULT VALUE
        patient_id = "P001"; // PATIENT ID DEFAULT VALUE
        doctor_id = "D001"; // DOCTOR ID DEFAULT VALUE
        reason = "Allergies"; // DEFAULT REASON VALUE
        medication = "Clarinite"; // DEFAULT MEDICATION VALUE
        Date d = new Date(12, 1, 2022); // DEFAULT DATE VALUE
        Time t = new Time(15, 30); // DEFAULT TIME VALUE
        Consultation_Room r = new Consultation_Room('B', 2, 205); // DEFAULT CONSULTATION ROOM VALUE
        date = d; // CREATING DATE TO D
        time = t; // CREATING TIME TO T
        room = r; // CREATING ROOM TO R
    }

    // Parameterized Constructor:
    /**
     * @param appointment_id
     * @param patient_id
     * @param doctor_id
     * @param reason
     * @param medication
     * @param date
     * @param time
     * @param room
     */
    Appointment(String appointment_id, String patient_id, String doctor_id, String reason,
            String medication, Date date, Time time, Consultation_Room room) {
        this.appointment_id = appointment_id; // PARAMETERIZED APPOINTMENT ID
        this.patient_id = patient_id; // PARAMETERIZED PATIENT ID
        this.doctor_id = doctor_id; // PARAMETERIZED DOCTOR ID
        this.reason = reason; // PARAMETERIZED REASON
        this.medication = medication; // PARAMETERIZED MEDICATION
        this.date = date; // PARAMETERIZED DATE
        this.time = time; // PARAMETERIZED TIME
        this.room = room; // PARAMETERIZED ROOM

    }

    // Sets a new appointment.
    /**
     * @param appointment_id sets Appointment ID
     * @param patient_id     sets Patient ID
     * @param doctor_id      sets Doctor ID
     * @param reason         sets Reason
     * @param medication     sets Medication
     * @param date           sets Date
     * @param time           sets Time
     * @param room           sets Room
     */
    public void setAppointment(String appointment_id, String patient_id, String doctor_id, String reason,
            String medication, Date date, Time time, Consultation_Room room) {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.reason = reason;
        this.medication = medication;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    // Create an appointment from an Appointment object.
    /**
     * @param c_Appointment
     */
    Appointment(Appointment c_Appointment) {
        appointment_id = c_Appointment.appointment_id;
        patient_id = c_Appointment.patient_id;
        doctor_id = c_Appointment.doctor_id;
        reason = c_Appointment.reason;
        medication = c_Appointment.medication;
        date = c_Appointment.date;
        time = c_Appointment.time;
        room = c_Appointment.room;
    }

    // Getter method:
    /**
     * @return Appointment_ID
     */
    public String getAppointment_id() {
        return appointment_id;
    }

    /**
     * @return Patient_ID
     */
    public String getPatient_id() {
        return patient_id;
    }

    /**
     * @return Doctor_ID
     */
    public String getDoctor_id() {
        return doctor_id;
    }

    /**
     * @return Reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @return Medication
     */
    public String getMedication() {
        return medication;
    }

    /**
     * @return Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return Time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @return Consultation_Room
     */
    public Consultation_Room getConsultR() {
        return room;
    }

    // String Format:
    public String toString() {
        return "Appointment ID: " + appointment_id + "\nPaitent ID: " + patient_id + "\nDoctor ID: " + doctor_id
                + "\nReason: " + reason + "  \nMedication: " + medication + "\nDate: " + date + "\nTime: "
                + time + "\n- - - - - - - - " + " Room " + "- - - - - - - -  " + room;
    }

    @Override
    public int compareTo(Appointment a) {
        return this.appointment_id.compareTo(a.appointment_id);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}