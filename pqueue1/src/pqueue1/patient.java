package pqueue1;

import java.util.Comparator;
import java.util.PriorityQueue;
//Employee Class
 class patient
{
    String id;
     int priority;
     public patient(String id, int priority)
    {
        this.id = id;
         this.priority = priority;
    }
     @Override
    public String toString()
    {
        return id + " : " + priority;
    }
}
