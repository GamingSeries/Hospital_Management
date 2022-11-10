package pqueue1;
import java.util.PriorityQueue;

import java.util.Iterator;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
public class Patient_queue implements Comparator<patient>{

	Queue<patient>pt= new LinkedList<>();

	public void joinQueue(patient p)
	{
		pt.add(p);
     
	}

	public void Consultation()
	{
		pt.poll();
	}

	public int size()
	{
		
		return pt.size();
		
	}

	public void clear()
	{
		Iterator <patient> p= pt.iterator();
		while(p.hasNext())
			pt.clear();
	}

	public void nextPatient()
	{
		System.out.println(pt.peek());
	}

	public void display()
	{
		for(patient i:pt)
		{
			System.out.println(i);
		}
	}
	public int compare(patient p1, patient p2)
    {
        return p2.priority - p1.priority;
    }
}

