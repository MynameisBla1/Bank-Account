public class PrivilegedAccount {
    double accountBalance;
    String ownerName;
    String accountType = "Privileged Account";
    double monthlyCharge;

    public PrivilegedAccount(double accountBalance, String ownerName, String accountType, double monthlyCharge) {
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.monthlyCharge = monthlyCharge;
    }
    //default constructor
    public PrivilegedAccount(){

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
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
