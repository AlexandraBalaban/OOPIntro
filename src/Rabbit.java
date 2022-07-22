public class Rabbit extends Animal{

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Rabbit is eating his grass.\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
