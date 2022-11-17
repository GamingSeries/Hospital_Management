/**
 * @author Muneeb Farooq
 * @version openJDL 17.0.3
 * @since openJDK 17.0.3
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test004 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Appointment> arr_list = new ArrayList<Appointment>();
		Appointment appointment1 = new Appointment();

		Date date3;
		date3 = new Date(21, 8, 2022);
		Time time3;
		time3 = new Time(9, 50);
		Consultation_Room room3;
		room3 = new Consultation_Room('K', 2, 280);

		Date date2;
		date2 = new Date(21, 8, 2022);
		Time time2;
		time2 = new Time(13, 22);
		Consultation_Room room2;
		room2 = new Consultation_Room('V', 4, 289);

		Date date; // 10/10/2022
		date = new Date();
		Time time; // 11:43
		time = new Time();
		Consultation_Room room;
		room = new Consultation_Room();

		arr_list.add(new Appointment("A105", "P107", "D115", "lung transplant", "surgery", date, time, room));
		arr_list.add(new Appointment("A107", "P120", "D125", "coughing", "cough syrup", date2, time2, room2));
		arr_list.add(new Appointment("A109", "P111", "D135", "asthma", "inhaler", date3, time3, room3));

		Date date5;
		date5 = new Date(9, 10, 2022);

		Time time5;
		time5 = new Time(10, 50);

		Consultation_Room room5;
		room5 = new Consultation_Room('E', 3, 400);

		Date date4;
		date4 = new Date(8, 12, 2022);

		Time time4;
		time4 = new Time(8, 30);

		Consultation_Room room4;
		room4 = new Consultation_Room('K', 2, 280);

		Date date6;
		date6 = new Date(1, 9, 2022);

		Time time6;
		time6 = new Time(2, 20);

		Consultation_Room room6;
		room6 = new Consultation_Room('K', 2, 32);

		Appointment[] app_list2 = new Appointment[3];
		app_list2[0] = new Appointment("A004", "P007", "D150", "asthma", "Inhaler", date4, time4, room4);
		app_list2[1] = new Appointment("A005", "P008", "D151", "cough", "Brufen", date5, time5, room5);
		app_list2[2] = new Appointment("A006", "P009", "D152", "heart disease", "transplant", date6, time6, room6);

		Collections.sort(arr_list, new SortByDateTime());
		Arrays.sort(app_list2, new SortByDateTime());

		System.out.println();
		System.out.println("Array List Sorted by date and time");
		for (Appointment x : arr_list) {
			System.out.println(x.getAppointment_id() + " " + x.getPatient_id() + " " + x.getDoctor_id() + " "
					+ x.getReason() + " " +
					x.getMedication() + " " + x.getDate() + " " + x.getTime() + " " + x.getConsultR());
		}

		System.out.println("\n Array Sorted by date and time");
		for (Appointment x2 : app_list2) {
			System.out.println();
			System.out.println(x2.getAppointment_id() + " " + x2.getPatient_id() + " " + x2.getDoctor_id() + " "
					+ x2.getReason() + " "
					+ x2.getMedication() + " " + x2.getDate() + " " + x2.getTime() + " " + x2.getConsultR());
			System.out.println();
		}
		
	}
}