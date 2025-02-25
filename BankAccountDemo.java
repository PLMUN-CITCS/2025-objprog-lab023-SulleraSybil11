class BankAccount {
    //Atrributes
    public String accountHolder;
    private double balance;
    protected String accountType;
    
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }
    
        public void deposit(double amount) {  //Method for deposit
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {  //Method for withdraw 
        if (amount > 0 && amount <= balance) {  
            balance -= amount;
        }
    }
    
    public double getBalance() {  //Method to return the current balance
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");  //Creating an object for Bank Account class

        myAccount.deposit(250.0);  //Calling deposit method
        myAccount.withdraw(100.0);  //Calling withdraw method
        System.out.println("Account Holder: " + myAccount.accountHolder);  //Printing accountHolder
        System.out.println("Account Type: " + myAccount.accountType);  //Printing accountType
        System.out.println("Current Balance: $" + myAccount.getBalance());  //Printing current balance
    }
}