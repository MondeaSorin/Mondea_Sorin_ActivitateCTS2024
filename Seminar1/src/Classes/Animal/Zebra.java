package Classes.Animal;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age);
    }
    @Override
    protected void eat(String food) {
        System.out.println("The zebra " + name + " is eating " + food + "!");
    }
}
