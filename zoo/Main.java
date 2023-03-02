package algorithms.zoo;

public class Main {
    public static void main(String[] args) {
        AnimalFeeder guard = new Guard();
        guard.feedAnimals(new Apple());

        Tourist tourist = new Tourist(new Apple());
        tourist.feedAnimals();
    }
}
