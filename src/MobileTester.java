import java.util.Scanner;

public class MobileTester {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone;

    public static void main(String[] args) {
        mobilePhone = new MobilePhone();

        int choice = 0;
        boolean quit = false;

        printChoices();

        while(!quit) {
            System.out.println("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printChoices();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    //modifyContact();
                    break;
                case 3:
                    //deleteContact();
                    break;
                case 4:
                    //findContact();
                    break;
                case 5:
                    showContacts();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printChoices() {
        System.out.println("0 - Display options.");
        System.out.println("1 - Add a contact.");
        System.out.println("2 - Modify a contact.");
        System.out.println("3 - Delete a contact.");
        System.out.println("4 - Find a contact.");
        System.out.println("5 - Print list of contacts.");
        System.out.println("6 - Exit program.");
    }

    public static void addContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        mobilePhone.newContact(Contact.createContact(new Name(name),
                new PhoneNumber(phoneNumber)));
    }

    public static void showContacts() {
        mobilePhone.displayContacts();
    }
}
