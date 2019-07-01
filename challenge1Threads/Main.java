package challenge1Threads;

public class Main {
    // This challenge is to make a joint bank account using threads
    // two people should withdraw and deposit sums as follows
    // starting balance 1000

    //person 1
    // deposit 300
    //withdraw 50

    //person 2
    // deposit 203.75
    // withdraw 100

    // second challenge make sure the withdrawal and deposit is synchronized

    //note for the challenge above i synchronized the entire method as java lang is not thread safe so system println
    // can block

    public static void main(String[] args) {


        BankAccount jointAccount = new BankAccount(12345678,1000);


        // person 1
        Thread t1= new Thread() {
            public void run() {
                jointAccount.deposit(300);
                jointAccount.withdraw(50);

            }
        };

        // person 2
        Thread t2= new Thread() {
            public void run() {
                jointAccount.deposit(203.75);
                jointAccount.withdraw(100);
            }
        };

        t1.start();
        t2.start();
    }
}
