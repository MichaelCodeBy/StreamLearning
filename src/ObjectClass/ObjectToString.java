package ObjectClass;

import java.sql.SQLOutput;

public class ObjectToString {
    public static void main(String[] args) {
        Person tom = new Person ("Tom");
        System.out.println(tom.toString()); //

    }
}
class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
// выводит ObjectClass.Person@eed1f14
    // для читаемого вида обычно метод toString переопределяют
    @Override
    public  String toString(){
       return "Person "+name;
    }
}