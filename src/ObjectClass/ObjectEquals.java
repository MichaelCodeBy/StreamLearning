package ObjectClass;
// Метод equals сравнивает два обьекта на равенство

public class ObjectEquals {
    public static void main(String[] args) {
        PersonO tom = new PersonO("Tom");
        PersonO bob = new PersonO("Bob");
        System.out.println(tom.equals(bob)); //false

        PersonO tom2 = new PersonO("Tom");//true
        System.out.println(tom.equals(tom2));
    }
}
class PersonO {
    private String name;
    public PersonO(String name){
        this.name=name;
    }
    @Override
    public boolean equals (Object obj){
        if(!(obj instanceof PersonO)) return false;
        PersonO p = (PersonO) obj;
        return this.name.equals(p.name);
    }
}