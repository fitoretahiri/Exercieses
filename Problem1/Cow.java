public class Cow extends Animals implements AnimalBehavior{
    private String cowType;
    public Cow(String name, int age, boolean isVaccinated, String cowType) {
        super(name, age, isVaccinated);
        this.cowType=cowType;
    }

    public String getCowType() {
        return cowType;
    }

    @Override
    public String animalSound() {
        return "Moo";
    }

    @Override
    public boolean makesMilk() {
        return true;
    }
}
