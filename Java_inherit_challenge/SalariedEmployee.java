public class SalariedEmployee extends Employee {
    private double anualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String brithDate,String hireDate, double annualSalary) {

        super(name, brithDate,hireDate);
        this.anualSalary= annualSalary;
    }

    @Override
    public double collectPay() {
       // return (int) anualSalary /26;
       double payCheck = anualSalary /26;
       double adjustedPay = (isRetired)?0.9 * payCheck:payCheck;
       return adjustedPay;
    }

    //TODO: add print from the logic
    public void retire()
    {
        terminate("09/12/2024");
        isRetired =true;

    }


}
