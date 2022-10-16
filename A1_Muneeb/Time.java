public class Time 
{
    private int hour;   //hours of the day(0-23)
    private int minute; //minutes within the hour (0-59)

    //No Parameterized Constructor:
    Time()
    {
        hour = 13;
        minute = 40;

        System.out.println("Enquiry Time: " + hour + ":" + minute);
    }

    //Parameterized Constructor:
    Time(int hour,int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    //Copy Constructor:
    Time(Time c_Time)
    {
        hour = c_Time.hour;
        minute = c_Time.minute;
    }
    //Setter Method:
    public void setTime(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }
    //Converting to String:
    public String toString()
    {
        return hour + " " + minute;
    }
}