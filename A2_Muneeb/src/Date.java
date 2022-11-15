public class Date implements Comparable<Date>, Cloneable{
    private int day;
    private int month;
    private int year;

    //Default Constructor
    Date()
    {
        day = 15;
        month = 6;
        year = 2020;
    }

    //Parameterized Constructor:
    /**
     * @param day parameterized day
     * @param month parameterized month
     * @param year parameterized year
     */
    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Setter Method
    /**
     * @param day Sets the Date
     * @param month Sets the Month
     * @param year Sets the Year
     */
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getter Method:
    /**
     * @return Day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * @return Month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @return Year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return Date
     */
    public String getDate()
    {
        return this.day + "/" + this.month + "/" + this.year;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    //Copy Method:
    /**
     * @param c copies all the objects
     */
    Date (Date c)
    {
        day = c.day;
        month = c.month;
        year = c.year;
    }
    
    //CompareTo Method:
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Date o) 
    {

        return this.getDate().compareTo(o.getDate());
    }

    //CLoning
    /**
     * @return
     * @throws CloneNotSupportedException
     */
    public Object Clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
