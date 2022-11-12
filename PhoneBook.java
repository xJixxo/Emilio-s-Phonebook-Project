package Home_Project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class 3/5
 * Phonebook class that contains arraylist of Contact objects which is the main phonebook of the user
 */
public class PhoneBook {
    /**
     * line breaker
     */
    String newLine = System.getProperty("line.separator");
    ArrayList<Contact> phoneBook = new ArrayList<>();

    /**
     * method that add a new contact by the input of the user
     */
    void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone of the new contact: ");
        String phone = scanner.nextLine();
        Contact c1 = new Contact(name, phone);
        this.phoneBook.add(c1);

    }

    /**
     * method for locating a specific contact from the arraylist
     * @param name the first object out of the arraylist with that name will be returned
     * @return the info about that contact
     */
    ArrayList<String> getContact(String name) {
        ArrayList<String> found = new ArrayList<>();

        for (Contact contact : this.phoneBook) {
            if (contact.name.equals(name)) {
                found.add(contact.name + " " + contact.phoneNumber + newLine);
            }
        }
        return found;
    }

    /**
     * method for adding a contact to an arraylist
     * @param cont the new contact that needs to be added to the arraylist
     */
    void newContact(Contact cont) {
        this.phoneBook.add(new Contact(cont.name,cont.phoneNumber));
    }

}


