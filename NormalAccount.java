public class NormalAccount {
    double accountBalance;
    String ownerName;
    String accountType = "Normal Account";
    double monthlyCharge;

    public NormalAccount(double accountBalance, String ownerName, String accountType, double monthlyCharge) {
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.monthlyCharge = monthlyCharge;
    }
    //default constructor
    public NormalAccount(){

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(double monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }
    public String getDetails(){
        return "\nAccount Balance: $" + accountBalance + "\nOwner Name: "+ownerName+
                "\nAccount Type: "+accountType+ "\nMonthly Charge: $"+monthlyCharge;
    }
}
