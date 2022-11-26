/**
 * @author Muneeb Farooq
 * @version openJDK 17.0.3
 * @since openJDK 17.0.3
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Test003 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Appointment> arr_list = new ArrayList<Appointment>();

        Date date_1;
        date_1 = new Date(16, 4, 2022);
        Date date_2;
        date_2 = new Date(5, 10, 2019);
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

        arr_list.add(new Appointment("A105", "P107", "D115", "lung transplant", "surgery", date_1, time_1, room_1));
        arr_list.add(new Appointment("A107", "P120", "D125", "coughing", "cough syrup", date_2, time_2, room_2));
        arr_list.add(new Appointment("A109", "P111", "D135", "asthma", "inhaler", date_3, time_3, room_3));



        // System.out.println(appointment1);

        // more dummy data
        /*
         * Date date1_1;
         * date1_1 = new Date(17, 1,2021);
         * Date date1_2;
         * date1_2 = new Date(9,15,2020);
         * Date date1_3;
         * date1_3 = new Date(12, 12, 2020);
         * 
         * Time time1_1;
         * time1_1 = new Time(15, 30);
         * Time time1_2;
         * time1_2 = new Time(16, 00);
         * Time time1_3;
         * time1_3 = new Time(16, 30);
         * 
         * Consultation_Room room1_1;
         * room1_1 = new Consultation_Room('B', 4, 405);
         * Consultation_Room room1_2;
         * room1_2 = new Consultation_Room('A', 2, 202);
         * Consultation_Room room1_3;
         * room1_3 = new Consultation_Room('B', 2, 205);
         */

        Date new_date1 = new Date(5, 7, 2022);
        Date new_date2 = new Date(7, 7, 2022);
        Date new_date3 = new Date(10, 10, 2022);

        Time new_time1 = new Time(13, 25);
        Time new_time2 = new Time(12, 30);
        Time new_time3 = new Time(15, 50);

        Consultation_Room new_room1;
        new_room1 = new Consultation_Room('A', 3, 305);
        Consultation_Room new_room2;
        new_room2 = new Consultation_Room('A', 3, 305);
        Consultation_Room new_room3;
        new_room3 = new Consultation_Room('A', 3, 305);

        Appointment[] app_list2 = new Appointment[3];
        app_list2[0] = new Appointment("A004", "P007", "D150", "asthma", "Inhaler", new_date1, new_time1, new_room1);
        app_list2[1] = new Appointment("A009", "P008", "D151", "cough", "Brufen", new_date2, new_time2, new_room2);
        app_list2[2] = new Appointment("A001", "P009", "D152", "heart disease", "transplant", new_date3, new_time3, new_room3);

        // Arrays.sort(app_list2);
        // Collections.sort(arr_list);

        System.out.println("_________________________________________________");
        System.out.println("Array before sorting Appointment ID");
        for (Appointment x : app_list2) {
            System.out.println(
                    x.getAppointment_id() + " " + x.getPatient_id() + " " + x.getDoctor_id() + " " + x.getReason() + " "
                            + x.getMedication() + " " + x.getDate() + " " + x.getTime() + " " + x.getConsultR());
        }

        System.out.println("_________________________________________________");
        System.out.println("Array List before sorting Appointment ID");

        for (Appointment y : arr_list) {
            System.out.println(
                    y.getAppointment_id() + " " + y.getPatient_id() + " " + y.getDoctor_id() + " " + y.getReason() + " "
                            + y.getMedication() + " " + y.getDate() + " " + y.getTime() + " " + y.getConsultR());
        }

        Arrays.sort(app_list2);
        Collections.sort(arr_list);

        System.out.println("_________________________________________________");
        System.out.println("Array sorted by Appointment ID");
        for (Appointment x : app_list2) {
            System.out.println(
                    x.getAppointment_id() + " " + x.getPatient_id() + " " + x.getDoctor_id() + " " + x.getReason() + " "
                            + x.getMedication() + " " + x.getDate() + " " + x.getTime() + " " + x.getConsultR());
        }

        System.out.println("_________________________________________________");
        System.out.println("Array List Sorted by Appointment ID");

        for (Appointment y : arr_list) {
            System.out.println(
                    y.getAppointment_id() + " " + y.getPatient_id() + " " + y.getDoctor_id() + " " + y.getReason() + " "
                            + y.getMedication() + " " + y.getDate() + " " + y.getTime() + " " + y.getConsultR());
        }

    }
}
