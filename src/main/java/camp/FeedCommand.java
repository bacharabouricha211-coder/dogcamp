package camp;

public class FeedCommand implements CampCommand {
    private final Dog dog;

    public FeedCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
    }
}
