package camp;

import java.util.ArrayList;
import java.util.List;

public class Camp {
    private final String name;
    private final List<PlayArea> playAreas;
    private final List<Dog> dogs = new ArrayList<>();

    public Camp(String name) {
        this.name = name;
        this.playAreas = List.of(
                new PlayArea("Agility Park", 8),
                new PlayArea("Quiet Zone", 4),
                new PlayArea("Splash Pool", 6));
    }

    public List<PlayArea> getPlayAreas() {
        return playAreas;
    }

    public void registerDog(Dog dog) {
        dogs.add(dog);
    }

    public void executeCommand(CampCommand cmd) {
        cmd.execute();
    }
}

