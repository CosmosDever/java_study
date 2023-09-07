package java_study.LAB_ZOO;
class Animal {
    protected String name;  // Change the access modifier to protected
    private int age;
    private String sound;


    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public String getName() {
    return name;
    }
    public void getAge() {
        System.out.println(name + " age is " + age);
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }
}
class Mammal extends Animal {
    public Mammal(String name, int age, String sound) {
        super(name, age, sound);
    }

    public void breastfeeding() {
        System.out.println(name + " is breastfeeding");
    }
}

class Bird extends Animal {
    public Bird(String name, int age, String sound) {
        super(name, age, sound);
    }

    public void eatseeds() {
        System.out.println(name + " is eating seeds.");
    }
}
class Fish extends Animal {
    public Fish(String name, int age, String sound) {
        super(name, age, sound);
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}


