package Collections;
import java.util.HashSet;

public class Set {

        public static void main(String[] args) {

            HashSet<String> states = new HashSet<String>();

            // добавим в список ряд элементов
            states.add("Germany");
            states.add("France");
            states.add("Italy");
            // пытаемся добавить элемент, который уже есть в коллекции
            boolean isAdded = states.add("Germany");
            System.out.println(isAdded);    // false

            System.out.printf("Set contains %d elements \n", states.size());    // 3

            for(String state : states){

                System.out.println(state);
            }
            // удаление элемента
            states.remove("Germany");

            // хеш-таблица объектов Person
            HashSet<Person2> people = new HashSet<Person2>();
            people.add(new Person2("Mike"));
            people.add(new Person2("Tom"));
            people.add(new Person2("Nick"));
            for(Person2 p : people){

                System.out.println(p.getName());
            }
        }
    }
    class Person2{

        private String name;
        public Person2(String value){

            name=value;
        }
        String getName(){return name;}
    }

