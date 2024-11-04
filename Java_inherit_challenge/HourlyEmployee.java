public class HourlyEmployee extends Employee {
    private double hourlyPayrate;


    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayrate)
    {
        super(name,birthDate,hireDate);
        this.hourlyPayrate = hourlyPayrate;
    }




    //overriding collectPay method used in employee class
    @Override 
    public double collectPay(){
        return 40 * hourlyPayrate;
    }

    //return double pay
    public double getDoublepay()
    {
        return 2 * collectPay();
    }
}
