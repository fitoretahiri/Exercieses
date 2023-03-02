public class MallardDuck extends Duck{
    public MallardDuck(){
        flyingBehaviour = new Flying();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck!!");
    }
}
