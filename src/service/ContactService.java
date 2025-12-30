package service;

import java.util.ArrayList;
import model.Contact;

/**
 * ContactService contains business logic
 * for managing Contact objects.
 */
public class ContactService {

    private ArrayList<Contact> contacts = new ArrayList<>();

    /**
     * Adds a contact after checking for duplicate IDs.
     */
    public void addContact(Contact c) {
        for (Contact existing : contacts) {
            if (existing.getId() == c.getId()) {
                System.out.println("Contact with same ID already exists");
                return;
            }
        }
        contacts.add(c);
        System.out.println("Contact added successfully");
    }

    /**
     * Displays all contacts.
     */
    public void displayContacts() {
        System.out.println("ID\tName\tPhone Number");
        for (Contact c : contacts) {
            System.out.println(
                c.getId() + "\t" +
                c.getName() + "\t" +
                c.getPhoneNumber()
            );
        }
    }

    /**
     * Searches for a contact by ID.
     */
    public Contact searchById(int id) {
        for (Contact c : contacts) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
