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

    //Parameterized Constructor:
    Date( int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    //Setter method:
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month =  month;
        this.year = year;
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
    public int getYear()
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
    public int compareTo(Date a) 
    {
        
        if(this.getYear() == a.getYear())
        {
            if (this.getMonth() == a.getMonth())
            {
                if (this.getDay() == a.getDay())
                {
                    return 0;
                }

                else if(this.getDay() > a.getDay())
                {
                    return 1;
                }

                else
                {
                    return -1;
                }

            }
            else if(this.getMonth() > a.getMonth())
            {
                return 1;
            }

            else
            {
                return -1;
            }
        }

        else if (this.getYear() > a.getYear())
        {
            return 1;
        }

        else
        {
            return -1;
        }
    }
}
