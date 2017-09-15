import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    List<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }

    public void newContact(Contact contact) {
        if (contact != null) {
            contacts.add(contact);
        }
    }

    public void displayContacts() {
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ") " + contacts.get(i).getName() + ": " +
            contacts.get(i).getPhoneNumber());
        }
    }
}
