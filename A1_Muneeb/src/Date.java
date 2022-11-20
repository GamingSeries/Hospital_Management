/**
 * @author Muneeb Farooq
 * @version openJDK 17.0.3
 * @since openJDK 17.0.3
 */
public class Date implements Comparable<Date>, Cloneable {
    // Private int day month and year

    private int day; // day of the month(1-31)
    private int month; // month of the year(1-12)
    private int year; // year

    // No Parameterized Constructor:
    Date() {
        day = 15;
        month = 9;
        year = 2007;
    }

    // Parameterized Constructor:
    /**
     * @param day
     * @param month
     * @param year
     */
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    // Setter method:
    /**
     * @param day
     * @param month
     * @param year
     */
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter method:
    /**
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * @return
     */
    public String getDate() {
        return this.day + " " + this.month + " " + this.year;
    }

    /**
     * @param c_Date
     */
    Date(Date c_Date) {
        day = c_Date.day;
        month = c_Date.month;
        year = c_Date.year;
    }

    // Converting to String:
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    // CompareTo Method:
    // @Override

    // Cloning Object
    // @Override
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Date a) {

        if (this.getYear() == a.getYear()) {
            if (this.getMonth() == a.getMonth()) {
                if (this.getDay() == a.getDay()) {
                    return 0;
                }

                else if (this.getDay() > a.getDay()) {
                    return 1;
                }

                else {
                    return -1;
                }

            } else if (this.getMonth() > a.getMonth()) {
                return 1;
            }

            else {
                return -1;
            }
        }

        else if (this.getYear() > a.getYear()) {
            return 1;
        }

        else {
            return -1;
        }
    }
}
