
public class BankAccount {
    // instance variable

    private String accountNum; // the account number
    private double balance;        // the amount on deposit

    /**
     * Constructs a bank account with an account number and initial balance
     *
     * @param acctNum the account number
     * @param initialBalance the initial balance
     */
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)  // note "mutator" method
    {
        double newBalance = balance + amount;
        balance = newBalance;                           // modifies instance var
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) // note "mutator" method
    {
        double newBalance = balance - amount;
        balance = newBalance;                   // modifies instance var
    }

    /**
     * Gets the account number
     *
     * @return the account number
     */
    public String getAccount()  // note "accessor" method
    {
        return accountNum;              // returns value of instance var
    }

    /**
     * Gets the current balance
     *
     * @return the balance
     */
    public double getBalance()  // note "accessor" method
    {
        return balance;                 // returns value of instance var
    }

    /**
     * Transfer funds from one bank account object to another
     *
     * @param destination the BankAccount object receiving the funds
     * @param amount the amount of money to be transferred
     */
    public void transferFundsA(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        // note explicit use of this to reference instance variables of the
        // object for which the method was called
        this.balance = this.balance - amount;
    }

    //  Another way to transfer funds - by calling deposit and withdraw methods.
    //  Shows explicit use of "this" to call another method for the same object
    //  for which the current method was called.
    public void transferFundsB(BankAccount destination, double amount)
    {
        destination.deposit(amount);    // deposit to "destination" account
        this.withdraw(amount);           // withdraw from this account
    }
}