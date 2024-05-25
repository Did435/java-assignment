public class  BankAccount2{

    

private String accountNumber;
private String accountName;
private double balance;
private static double interestRate;
public BankAccount2(String numberIn, String nameIn)
{
accountNumber = numberIn;
accountName = nameIn;
balance = 0;
}
public String getAccountName()
{
return accountName;
}
public String getAccountNumber()
{
return accountNumber;
}
public double getBalance()
{
return balance;
}
public void deposit(double amountIn)
{
balance = balance + amountIn;
}
public boolean withdraw(double amountIn)
{
if(amountIn > balance)
{
return false;
}
else
{
balance = balance - amountIn;
return true;
}
}
public static void setInterestRate(double rateIn)
{
interestRate = rateIn;
}
public static double getInterestRate()
{
return interestRate;
}
public void addInterest()
{
balance = balance + (balance * interestRate)/100;
}



public static void main(String[] args)
{
// create new bank account
BankAccount2 testAccount = new BankAccount2("1", "Ann T Dote");
test(testAccount); // send the account to the test method
System.out.println("Account Number: " + testAccount.getAccountNumber());
System.out.println("Account Name: " + testAccount.getAccountName());
System.out.println("Balance: " + testAccount.getBalance());
}
// a method that makes a deposit in the bank account
static void test(BankAccount2 accountIn)
{
accountIn.deposit(2500);
}
}
    

