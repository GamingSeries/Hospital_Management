package A2_Muneeb;

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
    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Setter Method
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getter Method:
    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public String getDate()
    {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    //Copy Method:
    Date (Date c)
    {
        day = c.day;
        month = c.month;
        year = c.year;
    }
    

    //CompareTo Method:
    @Override
    public int compareTo(Date o) 
    {

        return this.getDate().compareTo(o.getDate());
    }

    //CLoning Method:
    public Object Clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
