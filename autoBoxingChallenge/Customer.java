package autoBoxingChallenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<>();
    private String CustomerName;

    Customer(String Name, double balance){
        CustomerName=Name;
        transactions.add(Double.valueOf(balance));
    }

    public String getCustomerName(){
        return CustomerName;
    }
    public ArrayList<Double> getCustomerTransactions(){
        return transactions;
    }
    public void addCustomerTransaction(double amount){
        transactions.add(Double.valueOf(amount));
    }

    public void showTransactions() {
        for(Double value:transactions){
            System.out.println("Transaction value is:"+value.toString());
        }
    }
}
