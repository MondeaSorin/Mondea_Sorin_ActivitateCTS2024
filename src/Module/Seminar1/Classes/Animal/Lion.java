package Module.Seminar1.Classes.Animal;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    protected void eat(String food) {
        System.out.println("The lion " + name + " is eating " + food + "!");
    }
}
