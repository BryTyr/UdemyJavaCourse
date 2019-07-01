package challenge1Threads;

public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public synchronized void deposit(double amount){
            balance=balance+amount;
            System.out.println("Deposit of "+amount+" successful: account balance is: "+balance);
    }

    public synchronized void withdraw(double amount){
            if(0>balance-amount){
                System.out.println("Withdrawal of"+amount +"unsuccessful: account balance is: "+ balance);
                return;
            }else{
                balance=balance-amount;
                System.out.println("Withdrawal of "+amount+" successful: account balance is: "+balance);
            }
        }

 public int getAccountNumber(){
     return accountNumber;
 }
    public void printAccountNumber(){
        System.out.println("Account number: "+accountNumber);
    }
}
