
public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    //static field will let you share data among all the instances
    private static int employeeNo = 7700;

    
    public Employee(){
        super("","");
    }
    public Employee(String name, String birthDate, String hireDate ){
        super(name, birthDate);
        //this.employeeId= employeeId;
        this.employeeId = Employee.employeeNo++;
        this.hireDate= hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                    "employeeId='" + employeeId + '\'' +
                    ", birthdate='" + hireDate + '\'' +
                "} "+super.toString();
    }
}

  
