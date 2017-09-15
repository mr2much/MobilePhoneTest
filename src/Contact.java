public class Contact {
    private final Name _name;
    private final PhoneNumber _phoneNumber;

    private Contact(final Name name, final PhoneNumber phoneNumber) {
        _name = name;
        _phoneNumber = phoneNumber;
    }

    public Name getName() {
        return _name;
    }

    public PhoneNumber getPhoneNumber() {
        return _phoneNumber;
    }

    public static Contact createContact(final Name name, final PhoneNumber phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public String toString() {
        return _name + " " + _phoneNumber;
    }
}
