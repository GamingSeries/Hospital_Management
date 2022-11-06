package A2_Muneeb;

public class Patient
{

    private String patient_ID;
    private Date date;
    private String problem;
    private int priority;

    Patient()
    {
        patient_ID = "P001";
        date = new Date();
        problem = "Asthma";
        priority = 5;
    }

    Patient(String PatientID, Date date, String problem, int priority)
    {
        this.patient_ID = PatientID;
        this.date = date;
        this.problem = problem;
        this.priority = priority;
    }

    public String toString()
    {
        return "Patient ID: " + patient_ID + "\nDate: " + date + "\nProblem: "  + problem + "\nPriority: " + priority;
    }

    public int compareTo(Patient p)
    {
        if(priority == p.priority)
        {
            return 0;
        }

        else if(priority < p.priority)
        {
            return 1;
        }

        else
        {
            return -1;
        }
    }
    
}
