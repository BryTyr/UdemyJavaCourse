package autoBoxingChallenge;

import java.util.ArrayList;

public class Branch  {
    private String BranchName;
    private ArrayList<Customer> customers=new ArrayList<>();

    Branch(String BranchName){
        this.BranchName=BranchName;
    }

    public String getBranchName(){
        return BranchName;
    }

    public void AddNewCustomer(Customer customer){
        customers.add(customer);
    }

    public void addTransaction(Customer customer,double amount){
        int index = customers.indexOf(customer);
        if(index>=0){
            customers.get(index).addCustomerTransaction(amount);
        }else{
            System.out.println("Customer does not exist");
        }
    }
    public void showCustomerList(){
        for(Customer customer : customers){
            System.out.println("Customer name is "+customer.getCustomerName());
        }
    }
    public void showCustomerListAndTransactions(){
        for(Customer customer : customers){
            System.out.println("Customer name is "+customer.getCustomerName());
            customer.showTransactions();
        }
    }


}
