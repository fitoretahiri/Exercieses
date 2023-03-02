package algorithms.zoo;

import java.util.List;

public class Guard extends Person implements AnimalFeeder {
    public int salary;
    public List<Key> key;

    @Override
    public boolean feedAnimals(Food food) {
        System.out.println(food.getCalories() + "Calories");
        return (Math.random() > 0.5);
    }
}
