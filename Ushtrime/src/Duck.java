public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
