package A2_Muneeb;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Patient_Queue
{
    private LinkedList <Patient> list_1 = new LinkedList<Patient>();
    Queue<Patient> patient_list1 = new LinkedList<Patient>();
    PriorityQueue<Patient> patient_list2 = new PriorityQueue<Patient>();

    public void joinQueue1(Patient p)
    {
        patient_list1.add(p);
    }

    public void joinQueue2(Patient p)
    {
        patient_list1.add(p);
    }

    public void Consultation1()
    {
        System.out.println("Patient to Remove: " + patient_list1.peek());
        patient_list1.remove();
        System.out.println("Next Patient: " + patient_list1.peek());
    }

    public void Consultation2()
    {
        System.out.println("Patient to Remove: " + patient_list1.peek());
        patient_list1.remove();
        System.out.println("Removed Patient: " + patient_list1.peek());
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

    public void display2()
    {
        for (Patient x:patient_list2)
        {
            System.out.println(x);
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