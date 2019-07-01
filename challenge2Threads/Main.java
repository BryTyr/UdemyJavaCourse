package challenge2Threads;

public class Main {
    // This challenge continues using the code from the first challenge for threads
    // in this challenge we are asked to use reentrant locks over the synchronized keyword

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
