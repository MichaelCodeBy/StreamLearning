import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        //старый подход циклом FOR (Императивный)
        // новый подход после жава 8 (деклоративный)

        //Filter
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        //predators.forEach(System.out::println);

        //Sort
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge).reversed())
                .collect(Collectors.toList());
        //sorted.forEach(System.out::println);

        //All match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge()>10);
        System.out.println(allMatch );

        //Any match
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge()>10);
        System.out.println(anyMatch );

        //None match
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getName().equals("Lipton)"));
        System.out.println(noneMatch );

        // Max
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        //Min
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        //Group
        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
classificationListMap.forEach(((classification, animals1) -> {
    System.out.println(classification);
    animals1.forEach(System.out::println);
    System.out.println();
}));

//Chening
        Optional<String> olderHerbAnimal=animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.HERBIVORE))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        olderHerbAnimal.ifPresent(System.out::println);
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


