/**
 * @author Muneeb Farooq
 * @version openJDK 17.0.3
 * @since openJDK 17.0.3
 */

public class Time implements Comparable<Time>, Cloneable {
    private int hour; // hours of the day(0-23)
    private int minute; // minutes within the hour (0-59)

    // No Parameterized Constructor:
    Time() {
        hour = 15;
        minute = 30;
    }

    // Parameterized Constructor:
    /**
     * @param hour passes "hour" insde the constructor
     * @param minute passes "minute" insde the constructor
     */
    Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Copy Constructor:
    /**
     * @param c_Time copies Time attributes 
     */
    Time(Time c_Time) {
        hour = c_Time.hour;
        minute = c_Time.minute;
    }

    // Setter Method:
    /**
     * @param hour sets the hour 
     * @param minute sets the time 
     */
    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Getter Method:
    /**
     * @return hour 
     */
    public int getHour() {
        return hour;
    }

    /**
     * @return minute
     */
    public int getMinute() {
        return minute;
    }

    // Converting to String:
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return hour + ":" + minute;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Time a) {
        if (this.getHour() == a.getHour()) {
            if (this.getMinute() == a.getMinute()) {
                return 0;
            }

            else if (this.getMinute() > a.getMinute()) {
                return 1;
            }

            else {
                return -1;
            }
        }

        else if (this.getHour() > a.getHour()) {
            return 1;
        }

        else {
            return -1;
        }

    }

    // Cloning Object
    // @Override
    /**
     * @return super.clone()
     * @throws CloneNotSupportedException
     */
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }
}