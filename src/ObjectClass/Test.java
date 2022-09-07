package ObjectClass;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        PersonT Tom = new PersonT(10, "Tom");
        PersonT Tom2 = new PersonT(10, "Tom");
        System.out.println(Tom.equals(Tom2));
    }
}
class PersonT {
    int age;
    String name;

    public PersonT(int age, String name) {
        this.age = age;
        this.name = name;
    }
//если не прописать для объектов правила,то будет сравнивать ссылки
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonT person = (PersonT) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}