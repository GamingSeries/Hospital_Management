import java.util.Collection;

public class Time implements Comparable <Time>, Cloneable
{
    private int hour;   //hours of the day(0-23)
    private int minute; //minutes within the hour (0-59)

    //No Parameterized Constructor:
    Time()
    {
        hour = 15;
        minute = 30;
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

    //Getter Method:
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }

    //Converting to String:
    public String toString()
    {
        return hour + ":" + minute;
    }

    public int compareTo(Time a)
    {
        if (this.getHour() == a.getHour())
        {
            if (this.getMinute() == a.getMinute())
            {
                return 0;
            }

            else if (this.getMinute() > a.getMinute())
            {
                return 1;
            } 

            else
            {
                return -1;
            }
        }

        else if(this.getHour() > a.getHour())
        {
            return 1;
        }

        else
        {
            return -1;
        }

    }

    //Cloning Object
    //@Override
    public Object Clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}