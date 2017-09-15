public class Name {
    private final String _name;

    public Name(final String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
