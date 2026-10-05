package camp;

public class TransferCommand implements CampCommand {
    private final Dog dog;
    private final PlayArea target;

    public TransferCommand(Dog dog, PlayArea target) {
        this.dog = dog;
        this.target = target;
    }

    @Override
    public void execute() {
    }
}
