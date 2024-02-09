

package ZoosUnited.NorthZoo.animals;

import ZoosUnited.NorthZoo.Animal;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars");
    }
}
