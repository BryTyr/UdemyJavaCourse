package scopeChallenge;

import java.util.Scanner;

public class X {

      private int x;


    public X() {
        while(true) {
            System.out.println("Please enter an integer and press enter");
            Scanner x = new Scanner(System.in);
            this.x=Integer.parseInt(x.nextLine());
            x();
        }
    }

    public void x(){

        for(int x=1;x<=12;x++){
            System.out.println(this.x+" times "+x+" is "+(this.x*x));
        }
    }
}
