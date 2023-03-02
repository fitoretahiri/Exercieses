public class Dog extends Animals implements AnimalBehavior{
    private String dogBreed;
    public Dog(String name, int age, boolean isVaccinated, String dogBreed) {
        super(name, age, isVaccinated);
        this.dogBreed=dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    @Override
    public String toString() {
        return super.toString()+dogBreed;
    }

    @Override
    public String animalSound() {
        return "Bark";
    }
}
