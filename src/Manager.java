/**
   A manager is a salaried employee who also receives a bonus.
*/
public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   /**
      Constructs a manager with a given name, annual salary and weekly bonus.
      @param name the name of this employee
      @param salary the annual salary
      @param bonus the weekly bonus
    */
   public Manager(String name, int ID, String jobTitle, double salary, double bonus)
   {
      super(name, ID, jobTitle, salary);
      weeklyBonus = bonus;
   }

   public double weeklyPay()
   {
      return super.weeklyPay(hoursWorked) + weeklyBonus;
   }
}


