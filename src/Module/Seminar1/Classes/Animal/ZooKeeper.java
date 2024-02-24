package Module.Seminar1.Classes.Animal;

import Module.Seminar1.Classes.Animal.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal, String food) {
        animal.eat(food);
    }
}
