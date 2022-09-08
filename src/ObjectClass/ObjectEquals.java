package ObjectClass;
// Метод equals сравнивает два обьекта на равенство

public class ObjectEquals {
    public static void main(String[] args) {
        PersonO tom = new PersonO("Tom",5);
        PersonO bob = new PersonO("Bob",5);
        System.out.println(tom.equals(bob)); //false

        PersonO tom2 = new PersonO("Tom",3);//true if age=3 false
        System.out.println(tom.equals(tom2));
    }
}
class PersonO {
    private String name;
    private int age;
    public PersonO(String name,int age){

        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals (Object obj){
        if(!(obj instanceof PersonO)) return false;
        PersonO p = (PersonO) obj;
        return this.name.equals(p.name);
    }
}