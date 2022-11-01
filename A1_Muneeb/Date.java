public class Date implements Comparable<Date>, Cloneable
{
    private int day;    //day of the month(1-31)
    private int month;  //month of the year(1-12)
    private int year;   //year

    //No Parameterized Constructor:
    Date()
    {
        day = 15;
        month = 9;
        year = 2007;

    }

    public void default_date()
    {
        System.out.println("\t Default Parameter \t");
        System.out.println("Date: " + day + "/" +  month + "/" + year);
    }

    //Parameterized Constructor:
    Date( int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void parameterized_date()
    {
        System.out.println("\t Parameterized \t");
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    //Setter method:
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month =  month;
        this.year = year;
    }

    public void setter_date()
    {
        System.out.println("\t Setter Method \t");
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    //Getter method:
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int year()
    {
        return year;
    }

    public String getDate()
    {
        return this.day + " " + this.month + " " + this.year;
    }
    

    Date(Date c_Date)
    {
        day = c_Date.day;
        month = c_Date.month;
        year = c_Date.year;
    }

    // bhai ab zara run karo test 004 karun run? karo jaani
    //Converting to String:
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    //CompareTo Method:
    //@Override
   

    //Cloning Object
    //@Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public int compareTo(Date o) {
        return this.getDate().compareTo(o.getDate());
    }
}
