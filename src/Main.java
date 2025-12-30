import model.Contact;
import service.ContactService;

/**
 * Entry point of the Contact Management System.
 */
public class Main {

    public static void main(String[] args) {

        ContactService contactService = new ContactService();

        Contact contact1 = new Contact();
        contact1.setId(1);
        contact1.setName("Aadarsh");
        contact1.setPhoneNumber("9876543210");

        Contact contact2 = new Contact();
        contact2.setId(2);
        contact2.setName("Rahul");
        contact2.setPhoneNumber("9123456789");

        contactService.addContact(contact1);
        contactService.addContact(contact2);

        System.out.println("\nAll Contacts:");
        contactService.displayContacts();

        System.out.println("\nSearching for contact with ID 1:");
        Contact foundContact = contactService.searchById(1);

        if (foundContact != null) {
            System.out.println("Contact Found:");
            System.out.println("Name: " + foundContact.getName());
            System.out.println("Phone: " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found");
        }
    }
}
