package encapsulationPrinter;

public class Printer {
    private int tonerLevel;
    private double numberOfPagesPrinted;
    private boolean IsDuplexPrinter;

    Printer(int startingTonerLevel, boolean IsDuplexPrinter){
        numberOfPagesPrinted=0;
        if(startingTonerLevel<0||startingTonerLevel>100){
            System.out.println("Invalid starting toner value should be between 0 - 100 percent");
            tonerLevel=0;
        }else{
            tonerLevel=startingTonerLevel;
        }
        this.IsDuplexPrinter=IsDuplexPrinter;

    }

    public void PrintPages(int PageAmount) {
        for (int i=0;i<PageAmount;i++) {

            if (tonerLevel == 0) {
                System.out.println("Toner level is 0 refill toner");
                break;
            } else {
                tonerLevel -=1;
                if(IsDuplexPrinter){
                    //two sided hence one side of page done each time
                    numberOfPagesPrinted +=1;
                    if(numberOfPagesPrinted%2!=0) {
                        System.out.println("Page printed print count " + (int)numberOfPagesPrinted/2 + " and one side of page; toner percentage left " + tonerLevel);
                    }else{
                        System.out.println("Page printed print count " + (int)(numberOfPagesPrinted / 2) + " toner percentage left " + tonerLevel);

                    }
                }else {
                    numberOfPagesPrinted += 1;
                    System.out.println("Page printed print count " + numberOfPagesPrinted+" toner percentage left " + tonerLevel);
                }

            }
        }
    }
    public void fillUpToner(int TonerAmount){
        if(TonerAmount<0||TonerAmount>100){
            System.out.println("Invalid toner value should be between 0 - 100 percent");
            return;
        }else{
            if((TonerAmount+tonerLevel)>100){
                tonerLevel=100;
                return;
            }
            else{
                tonerLevel+=TonerAmount;
            }
        }
    }

}
