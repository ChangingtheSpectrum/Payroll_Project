/**
   An hourly employee is paid for every hour worked.
*/
public class HourlyEmployee extends Employee
{
   private double hourlyWage;
   private double hoursWorked;

   /**
      Constructs an hourly employee with a given name and weekly wage.
      @param name the name of this employee
      @param wage the hourly wage 
   */
   public HourlyEmployee(String name, int ID, String jobTitle, double wage, double hours)
   {
      setName(name);
      setID(ID);
      setJobTitle(jobTitle);
      hourlyWage = wage;
      hoursWorked=hours;
   }
 
   public double weeklyPay()
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         // Add overtime
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
   }
}

