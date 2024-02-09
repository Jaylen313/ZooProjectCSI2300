

package ZoosUnited.NorthZoo.animals;
import ZoosUnited.NorthZoo.Animal;
import ZoosUnited.NorthZoo.Swimmable;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " bubbles");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
