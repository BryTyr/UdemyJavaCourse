package challenge2Threads;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private int accountNumber;
    private ReentrantLock bankActionLock;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        bankActionLock=new ReentrantLock();
    }

    public void deposit(double amount){
        bankActionLock.lock();
        try {
            balance = balance + amount;
            System.out.println("Deposit of " + amount + " successful: account balance is: " + balance);
        }finally{
            bankActionLock.unlock();
        }
    }

    public void withdraw(double amount){
        bankActionLock.lock();
        try {
            if (0 > balance - amount) {
                System.out.println("Withdrawal of" + amount + "unsuccessful: account balance is: " + balance);
                return;
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal of " + amount + " successful: account balance is: " + balance);
            }
        }finally{
            bankActionLock.unlock();
        }
        }

 public int getAccountNumber(){
     return accountNumber;
 }
    public void printAccountNumber(){
        System.out.println("Account number: "+accountNumber);
    }
}
