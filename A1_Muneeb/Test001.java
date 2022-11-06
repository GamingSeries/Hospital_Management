public class Test001 
{
    public static void main(String[] args)
    {
        Appointment appointment_1 = new Appointment();
        System.out.println();
        System.out.println("\t Appointment 1 \t ");
        System.out.println(appointment_1);
        Appointment appointment_2 = new Appointment(appointment_1);
        System.out.println();
        System.out.println("\t Appointment 2 \t ");
        System.out.println(appointment_2);
    }

    
}