/**
   An employee has a name and a mechanism for computing weekly pay.
*/
public class Employee
{
   private String name; private int ID; private String jobTitle;

   /**
      Constructs an employee with an empty name.
   */
   public Employee()
   {
      name = "";
      ID=0;
      jobTitle="";
   }

   /**
      Sets the name of this employee.
      @param employee_name the new name 
   */
   public void setName(String employeeName)
   {
      name = employeeName;
   }

   /**
      Gets the name of this employee.
      @return the name 
   */
   public String getName()
   {
      return name; 
   }
   
   public void setID(int ID) { this.ID=ID; }
   public int getID() { return ID; }
   public void setJobTitle(String jobTitle) { this.jobTitle=jobTitle; }
   public String getJobTitle() { return jobTitle; }

   /**
      Computes the pay for one week of work.
      @param hoursWorked the number of hours worked in the week
      @return the pay for the given number of hours
   */
   public double weeklyPay()
   {
      return 0; 
   }
   
   
}
