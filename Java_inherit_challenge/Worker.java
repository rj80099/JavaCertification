import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {

    }
    public Worker(String name, String birthdate){
        this.name = name;
        this.birthDate = birthdate;

    }

    //bithDate: mm/dd/yyyy
    public int getAge(){
        Date getCurrentDate = new Date();
        int currentYear = getCurrentDate.getYear() + 1900;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }

    //TODO: extend the funtionality accordinng to type of employee
    public double collectPay() {
         return 0.0;
    }

    //TODO: Implement the termination in the subclass for more specific type of employee
    public void terminate(String endDate){
        this.endDate = endDate;

    }

    @Override
    public String toString() {
        return "Worker{" +
                    "name='" + name + '\'' +
                    ", birthdate='" + birthDate + '\'' +
                ", endDate='"+endDate +'\'' +
                '}';
    }
}
