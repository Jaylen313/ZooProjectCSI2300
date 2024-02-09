
package ZoosUnited.NorthZoo;
public abstract class Animal {
    protected String name;
   
    private int age;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    protected void sleep() {
        System.out.println(name + " is sleeping");
    }

    
    private void privateMethod() {
        System.out.println("This is a private method");
    }
}
