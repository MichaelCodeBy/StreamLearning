package Collections;

import java.util.TreeSet;
//Обобщенный класс TreeSet<E> представляет структуру данных в виде дерева,
// в котором все объекты хранятся в отсортированном виде по возрастанию.
// TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet,
// а следовательно, и интерфейс SortedSet.
/*В классе TreeSet определены следующие конструкторы:

        TreeSet(): создает пустое дерево

        TreeSet(Collection<? extends E> col): создает дерево, в которое добавляет все элементы коллекции col

        TreeSet(SortedSet <E> set): создает дерево, в которое добавляет все элементы сортированного набора set

        TreeSet(Comparator<? super E> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.

        TreeSet поддерживает все стандартные методы для вставки и удаления элементов:

 */
public class SortedSet{

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        // удаление элемента
        states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }
    }
}