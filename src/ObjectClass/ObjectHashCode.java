package ObjectClass;

// Метод hashCode позволяет задать некоторое числовое значение, которое  будет соответствовать данному обьекту
// По данному числу можно сравнивать обьекты.


public class ObjectHashCode {
    public static void main(String[] args) {
        Person2 tom2 = new Person2("Tom2");
        System.out.println(tom2.hashCode()); //250421012

    }

    static class Person2 {
        private String name;

        public Person2(String name) {
            this.name = name;
        }


       @Override
       public int hashCode() {
           return 10 * name.hashCode() + 20456;//можно задать свой алгоритм определения хэшкода в обьекте получится 26145896
       }
    }
}