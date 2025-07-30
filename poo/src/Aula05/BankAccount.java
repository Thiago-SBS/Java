package Aula05;

public class BankAccount {
    public int accountNumber;
    protected String accountType;
    private String accountOwner;
    private double accountBalance;
    private boolean accountStatus;

    public BankAccount() {
        this.setAccountBalance(0);
        this.setAccountStatus(false);
    }

    public void currentStatus() {
        System.out.println("--------------------------------");
        System.out.println("Account: " + this.getAccountNumber());
        System.out.println("Type: " + this.getAccountType());
        System.out.println("Owner: " + this.getAccountOwner());
        System.out.printf("Balance: $ %.2f \n", this.getAccountBalance());
        System.out.println("Status: " + this.getAccountStatus());
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public  void setAccountType(String type) {
        this.accountType = type;
    }
    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountOwner(String owner) {
        this.accountOwner = owner;
    }
    public String getAccountOwner() {
        return this.accountOwner;
    }
    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void setAccountStatus(boolean status) {
        this.accountStatus = status;
    }
    public boolean getAccountStatus() {
        return this.accountStatus;
    }


    public void openAccount(String type) {
        this.setAccountType(type);
        this.setAccountStatus(true);

        if (type.equals("CC")) {
            this.setAccountBalance(50);
        } else if (type.equals("CP")) {
            this.setAccountBalance(150);
        }
        System.out.println("Account created successfully.");
    }
    public void closeAccount() {
        if (0 > this.getAccountBalance()) {
            System.out.println("Your account is in the red, settle any outstanding debts to close it.");
        } else if (0 < this.getAccountBalance()) {
            System.out.println("Your account can only be closed when it no longer has a balance.");
        } else {
            this.setAccountStatus(false);
            System.out.println("Account closed successfully.");
        }
    }
    public void deposit(double value) {
        if (this.getAccountStatus()) {
            this.setAccountBalance(getAccountBalance() + value);
            System.out.println("deposit made into the account of " + this.getAccountOwner());
        } else {
            System.out.println("invalid account, Unable to make deposit.");
        }
    }
    public void withdraw(double value) {
        if (this.getAccountStatus()) {
            if (this.getAccountBalance() >= value) {
                this.setAccountBalance(this.getAccountBalance() - value);
                System.out.println("Withdraw made into the account of " + this.getAccountOwner());
            } else {
                System.out.println("unavailable balance.");
            }
        } else {
            System.out.println("invalid account, Unable to make withdraw.");
        }
    }
    public void payMonthly() {
        int value = 0;
        if (this.getAccountType().equals("CC")) {
            value = 12;
        } else if (this.getAccountType().equals("CP")){
            value = 20;
        }
        if (this.getAccountStatus()) {
            if (this.getAccountBalance() > value) {
                this.setAccountBalance(this.getAccountBalance() - value);
                System.out.println("Monthly fee successfully paid by " + this.getAccountOwner());
            } else {
                System.out.println("unavailable balance to pay the monthly fee.");
            }
        } else {
            System.out.println("invalid account, Unable to make pay monthly.");
        }
    }
}