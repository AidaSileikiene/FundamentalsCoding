package contactManagerApp;

public class ContactMain {

    public static void main(String[] args) {

        Contact brother = new Contact();
        brother.setName("Karolis");
        brother.setEmail("karolis@gmail.com");
        brother.setPhoneNumber("+123456");

        ContactService contactService = new ContactService();
        contactService.addContact(brother);
        contactService.showContactsList();

        Contact sister = new Contact("Diana", "diana@gmail.com", "+654321");
        contactService.addContact(sister);
        contactService.showContactsList();

        System.out.println();
        //Pabandom surasti esama kontakta
        Contact foundContact = contactService.searchContact("karolis");
        System.out.println(foundContact);
    }
}
