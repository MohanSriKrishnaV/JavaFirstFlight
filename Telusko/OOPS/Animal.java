public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
        dog.run(); // Method from Dog class

    }
}

class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
        System.out.println(getClass().getSimpleName() + " class anme");
    }

    public void run() {
        System.out.println(name + " is runing");
    }
}

class Dog extends Animals {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    public void run() {
        System.out.println(name + " is runing fast");
        System.out.println(getClass().getSimpleName() + " class anme");

    }

}
