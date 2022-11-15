import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Patient_Queue
{
    private LinkedList <Patient> list_1 = new LinkedList<Patient>();
    Queue<Patient> patient_list1 = new LinkedList<Patient>();
    PriorityQueue<Patient> patient_list2 = new PriorityQueue<Patient>();

    /**
     * @param p Joins patient_list1 to the queue
     */
    public void joinQueue1(Patient p)
    {
        patient_list1.add(p);
    }

    /**
     * @param p Joins patient_list2 to the queue
     */
    public void joinQueue2(Patient p)
    {
        patient_list2.add(p);
    }
    
    public void Consultation1()
    {
        System.out.println("Patient to Remove: " + patient_list1.peek());
        patient_list1.remove();
        System.out.println("Next Patient: " + patient_list1.peek());
    }

    public void Consultation2()
    {
        System.out.println("Patient to Remove: " + patient_list2.peek());
        System.out.println("___________________________________________");
        patient_list2.poll();
        System.out.println();
        System.out.println("Remaining Patients: ");
        System.out.println("____________________");
    }

    public void clear1()
    {
        Iterator <Patient> x = patient_list1.iterator();
        while(x.hasNext())
        {
            x.next();
            x.remove();
        }
    }

    public void clear2()
    {
        Iterator <Patient> x = patient_list2.iterator();
        while(x.hasNext())
        {
            x.next();
            x.remove();
        }
    }

    public void display1()
    {
        for (Patient x:patient_list1)
        {
            System.out.println(x);
            System.out.println("___________________");
        }
    }


    public void display2(){
        PriorityQueue<Patient> patient_c = new PriorityQueue<Patient>(this.patient_list2);
        while(patient_c.size() != 0) { 
            Patient i = patient_c.poll();
            System.out.println(i.getPatientID() + " " + i.getDate() + " " + i.getProblem() + " " + i.getPriority());
        }
        if (this.size2() == 0){
            System.out.println("No patients in the queue");
        }
}

    public int size1() 
    {
        return patient_list1.size();
    }

    public int size2()
    {
        return patient_list2.size();
    }

    public void checkQueue1()
    {
        System.out.println(patient_list1.isEmpty());
    }

    public void checkQueue2()
    {
        System.out.println(patient_list2.isEmpty());
    }

}