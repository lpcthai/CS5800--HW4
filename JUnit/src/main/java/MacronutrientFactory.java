public abstract class MacronutrientFactory {
    private static MacronutrientFactory instance;

    protected MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new Macro();
        }
        return instance;
    }

    public abstract CarbFactory CarbFactory();
    public abstract ProteinFactory ProteinFactory();
    public abstract FatFactory FatFactory();
}
