

package ZoosUnited.NorthZoo.animals;

import ZoosUnited.NorthZoo.Animal;
import ZoosUnited.NorthZoo.Flyable;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screeches");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}
