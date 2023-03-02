public class Cat extends Animals implements AnimalBehavior{
    private String eyeColor;
    public Cat(String name, int age, boolean isVaccinated, String eyeColor) {
        super(name, age, isVaccinated);
        this.eyeColor=eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return super.toString()+eyeColor;
    }

    @Override
    public String animalSound() {
        return "Meow";
    }
}
