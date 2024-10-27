public class Macro extends MacronutrientFactory {

    public CarbFactory CarbFactory() {
        return CarbFactory.getInstance();
    }

    public ProteinFactory ProteinFactory() {
        return ProteinFactory.getInstance();
    }


    public FatFactory FatFactory() {
        return FatFactory.getInstance();
    }
}
