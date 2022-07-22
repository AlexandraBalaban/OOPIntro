public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println("Dog is wiggling his tail!\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
