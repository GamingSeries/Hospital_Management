package A2_Muneeb;

public class PatientTest002 {
    public static void main(String[] args) {

        Date date_1 = new Date(15, 12, 2020);
        Date date_2 = new Date(12, 11, 2020);
        Date date_3 = new Date(4, 5, 2020);
        Date date_4 = new Date(14, 2, 2020);
    
        Patient pat_1 = new Patient("P150", date_1, "cough", 4);
        Patient pat_2 = new Patient("P151", date_2, "fever", 2);
        Patient pat_3 = new Patient("P152", date_3, "OCD", 7);
        Patient pat_4 = new Patient("P153", date_4, "PTSD", 6);

        Patient_Queue pat_queue = new Patient_Queue();

        pat_queue.joinQueue2(pat_1);
        pat_queue.joinQueue2(pat_2);
        pat_queue.joinQueue2(pat_3);
        pat_queue.joinQueue2(pat_4);

        int size1=pat_queue.size2();
		System.out.println("Size of the before removing element is: " + size1);

        System.out.println("___________________________________________");
        pat_queue.display2();

        System.out.println("___________________________________________");
        pat_queue.Consultation2();
        System.out.println();
        pat_queue.display2();
        System.out.println();
        int size2=pat_queue.size2();

		System.out.println("Size of the queue after removing: " + size2);
        System.out.println("___________________________________________");
        System.out.println("Clearing All Elements");
        System.out.println("___________________________________________");
        pat_queue.clear2();
        int size3=pat_queue.size2();
		System.out.println("Size of the queue after clearing: " + size3);
        
    }
}
