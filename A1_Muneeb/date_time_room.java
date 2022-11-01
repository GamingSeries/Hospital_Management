import java.util.ArrayList;
import java.util.Collections;

public class date_time_room {
	
	
	public static void main(String[] args)  {
			
		ArrayList<Date> list1=new ArrayList<Date>(); // ARRAY LIST FOR DATE
		ArrayList<Time> list2=new ArrayList<Time>(); // ARRAY LIST FOR TIME
		ArrayList<Consultation_Room> list3=new ArrayList<Consultation_Room>(); // ARRAY LIST FOR CONSULTATION ROOM

		list1.add(new Date(12,12,2022));
		list1.add(new Date(10,11,2022));
		list1.add(new Date(01,9,2022));
		list1.add(new Date(28,12,2022));

		list2.add(new Time(5,10));
		list2.add(new Time(1,50));
		list2.add(new Time(9,15));
		list2.add(new Time(8,59));

		list3.add(new Consultation_Room('A',1,215));
		list3.add(new Consultation_Room('X',4,270));
		list3.add(new Consultation_Room('K',5,256));
		list3.add(new Consultation_Room('C',2,267));
		
		System.out.println("array list of date before sorting");
		System.out.println();
		for(Date x:list1) {
			System.out.println();
			System.out.println(x.getDate());
			System.out.println();
		}
		System.out.println("array list of time before sorting");
		System.out.println();
		for(Time x1:list2) {
			System.out.println();
			System.out.println(x1.getTime());
			System.out.println();
		}

		
		System.out.println("array list of consultation room before sorting");
		System.out.println();
		for(Consultation_Room x:list3) {
			System.out.println();
			System.out.println(x.getRoom());
			System.out.println();
		}

		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		System.out.println("array list of date after sorting");
		System.out.println();
		for(Date x:list1) {
			System.out.println();
			System.out.println(x.getDate());
			System.out.println();
		}
		System.out.println("array list of time after sorting");
		System.out.println();
		for(Time x1:list2) {
			System.out.println();
			System.out.println(x1.getTime());
			System.out.println();
		}
		
		System.out.println("array list of consultation room after sorting");
		System.out.println();
		for(Consultation_Room x1:list3) {
			System.out.println();
			System.out.println(x1.getRoom());
			System.out.println();
		}	

		

	}

}
