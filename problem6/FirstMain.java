package problem6;

import java.util.ArrayList;
import java.util.List;

public class FirstMain {
    public static void main(String[] args) {
        List<Furniture> furnitures = new ArrayList<>(List.of(new Chair("Wooden chair"), new Chair("Plastic chair"), new Table("Wooden table")));
        SlidingTable slidingTable = new SlidingTable("Sliding Table");
        slidingTable.slide();
        furnitures.add(slidingTable);
        Room room = new Room(furnitures);
        System.out.println(room.toString());
    }
}
