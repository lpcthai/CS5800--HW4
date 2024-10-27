public class Carb {
    public enum Type {
        CHEESE, BREAD, LENTILS, PISTACHIO
    }

    private final Type type;

    public Carb(Type type) {
        this.type = type;
    }


    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Carb: " + type.name();
    }
}
