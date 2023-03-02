
public interface AnimalBehavior {
    String animalSound();

    default boolean makesMilk() {
        return false;
    }
}
