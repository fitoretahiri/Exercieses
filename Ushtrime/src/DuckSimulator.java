public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyingBehaviour(new FlyNoWay());
        mallard.performFly();
        mallard.display();
    }
}
