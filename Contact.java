package Home_Project;

import java.io.Serializable;
import java.util.Objects;
/**
 * Class 2/5
 * Contact class that contains name and phone number
 */
public class Contact  implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String phoneNumber;

    /**
     * @param name the name of the new contact
     * @param phone the phone of the new contact
     */
    Contact(String name, String phone) {
        super();
        this.name=name;
        this.phoneNumber=phone;
    }

    /**
     * @return Converts the contact class into a string
     */
    @Override
    public String toString() {
        return new StringBuffer(" Contact's name : ").append(this.name)
                .append(", Contact's phone number : ").append(this.phoneNumber).toString();
    }

    /**
     * @return the name of the contact
     */
    String getName(){
            return this.name;
    }

    /**
     * @return return the phone number of the contact
     */
    String getPhoneNumber(){
            return this.phoneNumber;
    }

    /**
     * method for comparing 2 contacts
     * used by case 8 in main class - removing duplicates
     * @param o the second contact that is being compared to the current contact
     * @return true if they are equal - false if they aren't equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact cont = (Contact) o;
        return phoneNumber.equals(cont.phoneNumber) &&
                name.equals(cont.name);
    }

    /**
     * used by case 8 in main class - removing duplicates
     * @return I actually have no idea what this method does - but at least there is a java doc above every method ;)
     */
    @Override
    public int hashCode() {
        return Objects.hash(name,phoneNumber);
    }
    }

