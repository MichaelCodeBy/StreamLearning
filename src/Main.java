import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Animal> animals=getAnimals();
        //старый подход циклом FOR (Императивный)
        // новый подход после жава 8 (деклоративный)

        //Filter
        animals.stream();

    }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Elefant", 20, Classification.HERBIVORE),
                new Animal("Lion", 10, Classification.PREDATOR),
                new Animal("Gien", 11, Classification.PREDATOR),
                new Animal("Giraffe", 7, Classification.HERBIVORE),
                new Animal("Gibon", 35, Classification.OMNIVOROUS),
                new Animal("Horse", 36, Classification.HERBIVORE),
                new Animal("Cat", 2, Classification.PREDATOR),
                new Animal("Dino", 200, Classification.HERBIVORE),
                new Animal("Dog", 20, Classification.PREDATOR),
                new Animal("Australopitec", 19, Classification.OMNIVOROUS),
                new Animal("Crocodile", 26, Classification.PREDATOR)
                );
    }
}


