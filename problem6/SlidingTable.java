package problem6;

public class SlidingTable extends Table {
    public SlidingTable(String name) {
        super(name);
    }

    public void slide() {
        this.name = "Slid " + this.name;
    }
}
