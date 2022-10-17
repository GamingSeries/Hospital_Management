import java.util.ArrayList;

public class Test003 {
    public static void main(String[] args) {
        ArrayList <Appointment> arr_list = new ArrayList<Appointment>();
        Appointment app_list = new Appointment();

        Date date_1;
        date_1 = new Date(16, 4,2022);
        Date date_2;
        date_2 = new Date(5,10,2019);
        Date date_3;
        date_3 = new Date(9, 10, 2022);

        Time time_1;
        time_1 = new Time(12, 30); 
        Time time_2;
        time_2 = new Time(13, 00);
        Time time_3;
        time_3 = new Time(13, 30);

        Consultation_Room room_1;
        room_1 = new Consultation_Room('A', 4, 405);
        Consultation_Room room_2;
        room_2 = new Consultation_Room('A', 2, 202);
        Consultation_Room room_3;
        room_3 = new Consultation_Room('B', 2, 205);

        app_list.setAppointment("P001", "D001", "FLU", date_1, time_1, room_1);
        app_list.setAppointment("P002", "d002", "Allergy", date_2, time_2, room_2);
        app_list.setAppointment("P003", "D003", "Fever", date_3, time_3, room_3);
        
    }
}
