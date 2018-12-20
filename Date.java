public class Date 
{  
   //Declaring private variables
    private int month;
    private int day;
    private int year;
    
    //Constructor for Date class
    public Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /* Method to Return the month */
    public int getMonth() 
    {
        return month;
    }

    /* Method to Set the Month */
    public void setMonth(int month) 
    {
        this.month = month;
    }

    /*Method to Return the day */
    public int getDay() 
    {
        return day;
    }

    /* Method to Set the day */
    public void setDay(int day) 
    {
        this.day = day;
    }

    /* Method to Return the year */
    public int getYear() 
    {
        return year;
    }

    /* Method to Set the year */
    public void setYear(int year) 
    {
        this.year = year;
    }
    
    // Method to Display the date
    public void displayDate()
    {
        System.out.println("Given Date :" + getMonth() + "/" + getDay() + "/" + getYear()); 
    }
  
}
  