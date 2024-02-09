

package ZoosUnited.NorthZoo;

import ZoosUnited.NorthZoo.animals.Lion;
import ZoosUnited.NorthZoo.animals.Fish;
import ZoosUnited.NorthZoo.animals.Eagle;

public class ZooApplication {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Fish fish = new Fish("Nemo", 2);
        Eagle eagle = new Eagle("Freedom", 3);

        lion.makeSound();
        lion.sleep();

        fish.makeSound();
        fish.swim();

        eagle.makeSound();
        eagle.fly();
    }
}
