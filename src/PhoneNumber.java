public class PhoneNumber {
    private final String _phoneNumber;

    public PhoneNumber(final String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public String toString() {
        return _phoneNumber;
    }
}
