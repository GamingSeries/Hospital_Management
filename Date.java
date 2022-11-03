public class Date implements Comparable<Date>, Cloneable{
    private int day;
    private int month;
    private int year;

    Date()
    {
        day = 15;
        month = 6;
        year = 2020;
    }

    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

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

    Date (Date c)
    {
        day = c.day;
        month = c.month;
        year = c.year;
    }
    


    @Override
    public int compareTo(Date o) 
    {

        return this.getDate().compareTo(o.getDate());
    }

    public Object Clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
