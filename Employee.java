public class Employee
{
  private String firstname;
  private String lastname;
  private double monthly_salary;
  
  public Employee(String firstname, String lastname, double monthly_salary)
  {
    this.firstname = firstname;
    this.lastname = lastname;
    
    if(monthly_salary > 0.0)
      this.monthly_salary = monthly_salary;
   
  }
  
   //set
  public void setfirstname(String firstname)
  {
    this.firstname = firstname;
  }
  
  //get
  public String getfirstname()
  {
    return firstname;
  }
  
   //set
  public void setlastname(String lastname)
  {
    this.lastname = lastname;
  }
  
  //get
  public String getlastname()
  {
    return lastname;
  }
  
   //set
  public void setmonthly_salary(double monthly_salary)
  {
    this.monthly_salary = monthly_salary;
  }
  
  //get
  public double getmonthly_salary()
  {
    return monthly_salary;
  }
  
  