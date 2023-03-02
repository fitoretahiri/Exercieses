package problem6;

import java.util.List;
import java.util.stream.Collectors;

public class Room {
    public List<Furniture> furnitures;

    public Room(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    @Override()
    public String toString() {
        return furnitures.stream().map(Furniture::toString).collect(Collectors.joining(", "));
    }
}
