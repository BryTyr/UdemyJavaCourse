package arrayListChallengeP2;

public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone();
        Menu menu = new Menu(phone);
        Contact paul= new Contact("Paul",123456789);
        Contact Sally= new Contact("Sally",987654321);
        Contact Katie= new Contact("Katie",123454321);
        Contact Bill= new Contact("Bill",123123123);

        phone.storeNewContact(paul.getName(),paul.getNumber());
        phone.storeNewContact(Sally.getName(),Sally.getNumber());
        phone.storeNewContact(Katie.getName(),Katie.getNumber());
        phone.storeNewContact(Bill.getName(),Bill.getNumber());

        menu.run();


    }
}
