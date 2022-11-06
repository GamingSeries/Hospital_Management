package A2_Muneeb;


public class PatientTest001 {
    public static void main(String[] args) {

        Date date_1 = new Date(15, 30, 2020);
        Date date_2 = new Date(15, 30, 2020);
        Date date_3 = new Date(15, 30, 2020);
        Date date_4 = new Date(15, 30, 2020);
    
        Patient pat_1 = new Patient("P100", date_1, "Cancer", 5);
        Patient pat_2 = new Patient("P101", date_2, "Athma", 3);
        Patient pat_3 = new Patient("P102", date_3, "Headache", 4);
        Patient pat_4 = new Patient("P103", date_4, "fever", 6);

        Patient_Queue pat_queue = new Patient_Queue();

        pat_queue.joinQueue1(pat_1);
        pat_queue.joinQueue1(pat_2);
        pat_queue.joinQueue1(pat_3);
        pat_queue.joinQueue1(pat_4);
        
        pat_queue.display1();


        
    }
}
