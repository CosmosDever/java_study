package java_study.LAB_ZOO;

public class Zoo {
    public static void main(String[] args) {
        Animal mammal = new Mammal("Lion", 5, "Roar");
        Animal bird = new Bird("Eagle", 3, "Screech");
        Animal fish = new Fish("Shark", 10, "Splash");

        makeAnimalSound(mammal);
        makeAnimalSound(bird);
        makeAnimalSound(fish);
        makeAnimalEat(mammal);
        makeAnimalEat(bird);
        makeAnimalEat(fish);
        AnimalEatseeds(bird);
        AnimalBreastfeeding(mammal);
        AnimalAge(mammal);
        AnimalAge(bird);
        AnimalAge(fish);


    }

    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
    public static void makeAnimalEat(Animal animal) {
        animal.eat();
    }
    public static void AnimalAge(Animal animal) {
        animal.getAge();
    }
    public static void Animalswim(Animal animal) {
    if (animal instanceof Fish) {
        Fish fish = (Fish) animal;
        fish.swim();
    }else {
        System.out.println(animal.getName() + " can't swim.");
    }
    }
    public static void AnimalEatseeds(Animal animal) {
    if (animal instanceof Bird) {
        Bird bird = (Bird) animal;
        bird.eatseeds();
    }else {
        System.out.println(animal.getName() + " can't eat seeds.");
    }  
    }
    public static void AnimalBreastfeeding(Animal animal) {
    if (animal instanceof Mammal) {
        Mammal mammal = (Mammal) animal;
        mammal.breastfeeding();
    }else {
        System.out.println(animal.getName() + " can't breastfeed.");
    }  
    }
}

