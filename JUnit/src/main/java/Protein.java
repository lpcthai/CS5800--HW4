public class Protein {
    public enum Type { CHICKEN, BEEF, TOFU, FISH }
    private final Type type;

    public Protein(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Protein: " + type.name();
    }

    public Type getType() {
        return type;
    }
}
