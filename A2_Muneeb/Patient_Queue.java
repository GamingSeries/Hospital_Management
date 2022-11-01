package A2_Muneeb;

import java.util.LinkedList;
import java.util.Queue;

public class Patient_Queue {
    private LinkedList <Patient> list_1 = new LinkedList<Patient>();
    Queue<Patient> patient_list1 = new LinkedList<Patient>();
    Queue<Patient> patient_list2 = new LinkedList<Patient>();

    public void joinQueue(Patient p)
    {
        patient_list1.add(p);
    }

    public Consultation()
    {
        System.out.println("Patient to Remove: " + patient_list1.peek());
        patient_list1.remove();
        System.out.println("Removed Patient: " + patient_list1.peek());
    }

    public void clear()
    {
        for(Patient x:patient_list1)
        {
            System.out.println(x);
        }
    }

    public void checkQueue()
    {
        System.out.println(patient_list1.isEmpty());
    }
}
