package algorithms.zoo;

public class Tourist extends Person implements AnimalFeeder {
    public Food favouriteFood;

    public Tourist(Food favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public boolean feedAnimals() {
        return feedAnimals(favouriteFood);
    }

    @Override
    public boolean feedAnimals(Food food) {
        System.out.println(food.getCalories());
        return (Math.random() > 0.5);
    }
}
