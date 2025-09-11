package dailyTasks;

// Abstract parent class
abstract class Account
{
                                                
    public abstract double getBalance();      // abstract method

    public void bankName()                    // non-abstract method
    {
        System.out.println("Bank Name: SBI");
    }
}


class SavingsAccount extends Account           // Subclass 
{
    private double balance;

    public SavingsAccount(double balance) 
    {
        this.balance = balance;
    }

    @Override
    public double getBalance()
    {
        return balance;
    }

    // overloading getBalance()
    public double getBalance(double interestRate)
    {
        return balance + (balance * interestRate / 100);
    }
}
class CurrentAccount extends Account     // Subclass 
{
    private double balance;

    public CurrentAccount(double balance)
    {
        this.balance = balance;
    }
    @Override
    public double getBalance()
    {
        return balance;
    }

    // overloading getBalance()
    public double getBalance(double serviceCharge, boolean deduct)
    {
        if (deduct)
        {
            return balance - serviceCharge;
        }
        return balance;
    }
}

// Main class
public class T3_5_AbstractClassAccount
{
    public static void main(String[] args)
    {
        Account acc1 = new SavingsAccount(10000);
        Account acc2 = new CurrentAccount(20000);

       
        acc1.bankName();
        acc2.bankName();

    
        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());

     
        SavingsAccount sa = new SavingsAccount(10000);
        System.out.println("Savings with Interest: " + sa.getBalance(5));

        CurrentAccount ca = new CurrentAccount(20000);
        System.out.println("Current after Service Charge: " + ca.getBalance(500, true));
    }
}
