package Interfaces;
// Класс Book и класс Journal связаны тем, что они реализуют интерфейс Printable.
// Поэтому мы динамически в программе можем создавать объекты Printable как экземпляры обоих классов:
public class Programone {

    public static void main(String[] args) {

        Printable1 printable1 = new Book1("Java. Complete Reference", "H. Shildt");
        printable1.print();      //  Java. Complete Reference (H. Shildt)
        printable1 = new Journal1("Foreign Policy");
        printable1.print();      // Foreign Policy
    }
}
interface Printable1{

    void print();
}
class Book1 implements Printable1{

    String name;
    String author;

    Book1(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal1 implements Printable1 {

    private String name;

    String getName(){
        return name;
    }

    Journal1(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}

