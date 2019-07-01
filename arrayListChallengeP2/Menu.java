package arrayListChallengeP2;

import java.util.Scanner;

public class Menu {

    private MobilePhone phone;

    Menu(MobilePhone phone){
        this.phone=phone;
    }

    private void quit(){
        System.exit(0);
    }
    private void printContactList(){
        phone.getContactList();
    }
    private void addNewContact(String Name,int Number){
        phone.storeNewContact(Name,Number);
    }
    private void updateExistingContact(String Name,int NewNumber){
        phone.modifyExistingContact(Name,NewNumber);
    }
    private void removeContact(String Name){
        phone.removeContact(Name);
    }
    private void findContact(String Name){
        Contact contact = phone.queryContact(Name);
        if(contact!=null){
            System.out.println(contact.getName()+" number is: "+contact.getNumber());
        }else{
            System.out.println("Contact does not exist");
        }
    }

    public void run(){
        String Name;
        int Number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the mobile phone menu");
        System.out.println("List of commands");
        System.out.println("1: Quit");
        System.out.println("2: Print list of contacts enter 2");
        System.out.println("3: Add new contact enter 3 followed by name and number");
        System.out.println("4: Update existing contact enter 4 followed by name and new number");
        System.out.println("5: Remove contact enter 5 Followed by name");
        System.out.println("6: Find Contact details Enter 6 followed by name");
        System.out.println("Press enter after each piece of info\n");

        while(true){
            System.out.println("Enter a new menu option:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1:
                    quit();
                    break;
                case 2:
                    printContactList();
                    break;
                case 3:
                    System.out.println("Please enter name below:");
                    Name = scanner.nextLine();
                    System.out.println("Please enter number below:");
                    Number = Integer.parseInt(scanner.nextLine());
                    addNewContact(Name,Number);
                    break;
                case 4:
                    System.out.println("Please enter name below:");
                    Name = scanner.nextLine();
                    System.out.println("Please enter number below:");
                    Number = Integer.parseInt(scanner.nextLine());
                    updateExistingContact(Name,Number);
                    break;
                case 5:
                    System.out.println("Please enter name below:");
                    Name = scanner.nextLine();
                    removeContact(Name);
                    break;
                case 6:
                    System.out.println("Please enter name below:");
                    Name = scanner.nextLine();
                    findContact(Name);
                    break;

                    default:
                     System.out.println("Invalid number on menu");
                     break;

            }




        }





    }


}
