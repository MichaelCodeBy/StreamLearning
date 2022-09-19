import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // System.out.println("до довавления " + list.size());
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(6);
        // System.out.println("после добавлени "+list.size());
        list.remove(0);
        // System.out.println("после удаления "+list.size());

        List<Integer>list2 = new LinkedList<>();

/*        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);
        System.out.println(set);


        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(5);
        set2.add(4);
        System.out.println(set2);
        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(18);
        set3.add(14);
        set3.add(12);
        set3.add(187);
        System.out.println(set3);*/
        Person person1 = new Person(30, "Bob");
        Person person2 = new Person(30, "Bob");

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set);
    }
}
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
