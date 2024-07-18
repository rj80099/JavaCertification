package Bank;

public class Bank {

    private String customerName;
    private int accountNumber;
    private double accountBalance;
    private String email;
    private String phoneNumber;


    //construtor

    public Bank(){
        this("Default Name",5674,1000.0,"Default email","Default phone number");
        System.out.println("Empty construtor called");
    }

    public Bank(String customerName, int accountNumber, double accountBalance, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdraw(double withdrawAmount) {

        if(withdrawAmount<0.0){
            System.out.println("Please enter valid amount");
        }

        if(this.accountBalance < withdrawAmount)
         System.out.println("Insufficient available fund");
        else {
        this.accountBalance = accountBalance-withdrawAmount;
        System.out.println("Amount of Rs. " + withdrawAmount+" is Successfully withdarwn. New balance is Rs."+accountBalance);
        }
    }

    public void depositFunds(double depositAmount){
            accountBalance+=depositAmount;

            System.out.println("Deposit of Rs." + depositAmount + " is made. New balance is " +
                                "Rs "+accountBalance);
    }
}
