public class Fat {
    public enum Type {
        AVOCADO, SOUR_CREAM, TUNA, PEANUTS;
    }

    private Type type;

    public Fat(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fat: " + type.name();
    }
}
