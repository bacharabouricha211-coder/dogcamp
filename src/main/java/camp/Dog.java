package camp;

public class Dog {
    private static int nextId = 1;

    private final int id;
    private String name;
    private int age;
    private PlayArea currentArea;

    public Dog(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age must be positive: " + age);
        }
        this.age = age;
        this.name = name;
        this.id = nextId++;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age must be positive: " + age);
        }
        this.age = age;
    }
}
