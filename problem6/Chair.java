package problem6;

public class Chair implements Furniture {
    public String name;

    public Chair(String name) {
        this.name = name;
    }

    @Override()
    public String toString() {
        return this.name;
    }
}
