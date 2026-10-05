package camp;

import java.util.ArrayList;
import java.util.List;

public class PlayArea {
    private final String name;
    private final int capacity;
    private final List<Dog> dogs = new ArrayList<>();

    PlayArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
