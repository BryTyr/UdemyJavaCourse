package autoBoxingChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> Branches = new ArrayList<Branch>();

    public void addBranches(Branch branch){
        Branches.add(branch);
    }

    public Branch getBranch(Branch Branch) {
        int index = Branches.indexOf(Branch);
        if(index>=0){
            return Branches.get(index);
        }else{
            System.out.println("branch does not exist");
            return null;
        }
    }
}
