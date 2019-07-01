package arrayListChallengeP2;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> PhoneBook = new ArrayList<>();

    public void getContactList(){
        for(Contact contact:PhoneBook){
            System.out.println("Contact Name is: "+contact.getName()+" and their number is: "+contact.getNumber());
        }
    }
    public void storeNewContact(String Name,int Number){
        Contact contact=queryContact(Name);
        if(contact==null){
            PhoneBook.add(new Contact(Name,Number));
            System.out.println("Contact created successfully");
        }else{
            System.out.println("Contact already exists");
        }

    }
    public void modifyExistingContact(String Name,int NewNumber){
        Contact contact=queryContact(Name);
        if(contact!=null){
            int index = PhoneBook.indexOf(contact);
            PhoneBook.set(index,new Contact(Name,NewNumber));
            System.out.println("Contact modified successfully");
        }else{
            System.out.println("Contact does not exist");
        }

    }
    public void removeContact(String Name){
        Contact contact=queryContact(Name);
        if(contact!=null){
            PhoneBook.remove(contact);
            System.out.println("Contact removed successfully");
        }else{
            System.out.println("Contact does not exist");
        }
    }

    public Contact queryContact(String Name){

        Contact contact=null;
        for(Contact singleContact : PhoneBook){
            boolean ContactExists = singleContact.getName().contains(Name);
            if(ContactExists) {
                contact = singleContact;
                return contact;
            }
        }
       return contact;
    }
}
