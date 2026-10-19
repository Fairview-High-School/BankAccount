public class BankAccount
{
    private String accountNumber;
    private String accountName;
    private double balance;
    private String password;
    public boolean loggedIn;

    public BankAccount(String accountNumber, String accountName,
                            double balance, String password)
    {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;
    }

    public String toString()
    {
        String text = "Account number: " + accountNumber + "\n";
        text += "Account name: " + accountName + "\n";
        text += "Balance: " + balance;

        return text;
    }




}