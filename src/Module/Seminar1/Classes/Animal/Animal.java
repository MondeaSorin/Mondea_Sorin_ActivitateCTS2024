package Module.Seminar1.Classes.Animal;

import Module.Seminar1.Interfaces.I_CanEat;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void eat(String food);
}