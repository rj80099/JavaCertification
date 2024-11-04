 
/*
 * Challenge:
 * Create the Worker class, the Employee class, and either the 
 * SalariedEmployee or the HourlyEmployee class
 * 
 * For each class, create the attributes and methods shown on this diagram.
 * Create a main method that will create either a SalariedEmployee or HourlyEmployee, 
 * and call the methods, getAge, collectPay, and the method shown for the specific type fo class you decide to implement
 * So if you implement SalariedEmployee, then execute retire().
 * If you implement HourlyEmployee, then execute getDoubePay()
 * 
 * 
 * More Specific type of Employee
 *    # A salaried employee is paid based on some percentage of this or her annual salary
 *    # If this person is retired, then the salary may be 100 percent of this amount, but it is generally reduced somewhat.
 *    # An hourly employee is paid by the hours worked and the hourly rate they agreed to work for.
 *    # An hourly employee may also get double pay if they work over a certain number od hours
 */
public class Main{
    public static void main(String[] args) {
    
    Employee tim = new Employee("Tim","11/11/1994","01/01/2020");
    System.out.println(tim);
    System.out.println("Age = " + tim.getAge());
    System.out.println("Pay = " + tim.collectPay());

    SalariedEmployee joe = new SalariedEmployee("joe","11/03/1961","01/01/2012",25000);
    System.out.println(joe);
    System.out.println("Age = " + joe.getAge());
    System.out.println("Joes's paycheck = $" + joe.collectPay());
    joe.retire();
    System.out.println("Joe's Pension check = $" + joe.collectPay());

    HourlyEmployee mary = new HourlyEmployee("mary", "12/03/1996", "04/14/2006", 15);
    System.out.println(mary);
    System.out.println("Mary's paycheck = $" + mary.collectPay());
    System.out.println("Mary's Holiday check = $" + mary.getDoublepay());
    }

}
