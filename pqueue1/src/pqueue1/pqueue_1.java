package pqueue1;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pqueue_1 {
	 
	     public static void main(String[] args)
	     {
	          
	    	 Patient_queue comparator = new Patient_queue();
	         PriorityQueue <patient> pQueue = new PriorityQueue <patient>(7, comparator);
	           
	          pQueue.offer(new patient("P1", 2));
	          pQueue.offer(new patient("P2", 1));
	          pQueue.offer(new patient("P3", 4));
	          pQueue.offer(new patient("P4", 3));
	          
	          //Removing the head elements
	          System.out.println(pQueue.poll());   
	          System.out.println(pQueue.poll());        
	          System.out.println(pQueue.poll());       
	          System.out.println(pQueue.poll());    
	         
	          
	 }
}