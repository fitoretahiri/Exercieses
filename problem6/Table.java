package problem6;

public class Table implements Furniture {
    public String name;

    public Table(String name) {
        this.name = name;
    }

    @Override()
    public String toString() {
        return this.name;
    }
}
