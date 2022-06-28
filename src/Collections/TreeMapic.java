package Collections;
//SortedMap
//Интерфейс SortedMap расширяет Map и создает отображение, в котором все элементы отсортированы
// в порядке возрастания их ключей. SortedMap добавляет ряд методов:

  /*      K firstKey(): возвращает ключ первого элемента отображения

        K lastKey(): возвращает ключ последнего элемента отображения

        SortedMap<K, V> headMap(K end): возвращает отображение SortedMap, которые содержит все элементы
        оригинального SortedMap вплоть до элемента с ключом end

        SortedMap<K, V> tailMap(K start): возвращает отображение SortedMap, которые содержит все элементы
        оригинального SortedMap, начиная с элемента с ключом start

        SortedMap<K, V> subMap(K start, K end): возвращает отображение SortedMap, которые содержит все
        элементы оригинального SortedMap вплоть от элемента с ключом start до элемента с ключом end
   */

//NavigableMap
//Интерфейс NavigableMap расширяет интерфейс SortedMap и обеспечивает возможность получения элементов
// отображения относительно других элементов. Его основные методы:

/* Map.Entry<K, V> ceilingEntry(K obj): возвращает элемент с наименьшим ключом k, который больше или
 равен ключу obj (k >=obj). Если такого ключа нет, то возвращается null.


        Map.Entry<K, V> floorEntry(K obj): возвращает элемент с наибольшим ключом k, который меньше или
         равен ключу obj (k <=obj). Если такого ключа нет, то возвращается null.

        Map.Entry<K, V> higherEntry(): возвращает элемент с наименьшим ключом k, который больше ключа
        obj (k >obj). Если такого ключа нет, то возвращается null.

        Map.Entry<K, V> lowerEntry(): возвращает элемент с наибольшим ключом k, который меньше ключа
         obj (k <obj). Если такого ключа нет, то возвращается null.

        Map.Entry<K, V> firstEntry(): возвращает первый элемент отображения

        Map.Entry<K, V> lastEntry(): возвращает последний элемент отображения

        Map.Entry<K, V> pollFirstEntry(): возвращает и одновременно удаляет первый элемент из отображения

        Map.Entry<K, V> pollLastEntry(): возвращает и одновременно удаляет последний элемент из отображения

        K ceilingKey(K obj): возвращает наименьший ключ k, который больше или равен ключу obj (k >=obj).
        Если такого ключа нет, то возвращается null.

        K floorKey(K obj): возвращает наибольший ключ k, который меньше или равен ключу obj (k <=obj).
        Если такого ключа нет, то возвращается null.

        K lowerKey(K obj): возвращает наибольший ключ k, который меньше ключа obj (k <obj).
        Если такого ключа нет, то возвращается null.

        K higherKey(K obj): возвращает наименьший ключ k, который больше ключа obj (k >obj).
         Если такого ключа нет, то возвращается null.

        NavigableSet<K> descendingKeySet(): возвращает объект NavigableSet, который содержит все ключи
         отображения в обратном порядке

        NavigableMap<K, V> descendingMap(): возвращает отображение NavigableMap, которое содержит все
         элементы в обратном порядке

        NavigableSet<K> navigableKeySet(): возвращает объект NavigableSet, который содержит все ключи
         отображения

        NavigableMap<K, V> headMap(K upperBound, boolean incl): возвращает отображение NavigableMap, которое
        содержит все элементы оригинального NavigableMap вплоть от элемента с ключом upperBound. Параметр incl при
        значении true указывает, что элемент с ключом upperBound также включается в выходной набор.

        NavigableMap<K, V> tailMap(K lowerBound, boolean incl): возвращает отображение NavigableMap, которое
        содержит все элементы оригинального NavigableMap, начиная с элемента с ключом lowerBound. Параметр incl
         при значении true указывает, что элемент с ключом lowerBound также включается в выходной набор.

        NavigableMap<K, V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): возвращает
        отображение NavigableMap, которое содержит все элементы оригинального NavigableMap от элемента с ключом
        lowerBound до элемента с ключом upperBound. Параметры lowIncl и highIncl при значении true включают в
        выходной набор элементы с ключами lowerBound и upperBound соответственно.*/

//TreeMap
  /*      Класс TreeMap<K, V> представляет отображение в виде дерева. Он наследуется от класса AbstractMap и
   реализует интерфейс NavigableMap, а следовательно, также и интерфейс SortedMap. Поэтому в отличие от
   коллекции HashMap в TreeMap все объекты автоматически сортируются по возрастанию их ключей.

        Класс TreeMap имеет следующие конструкторы:

        TreeMap(): создает пустое отображение в виде дерева

        TreeMap(Map<? extends K,​? extends V> map): создает дерево, в которое добавляет все элементы из отображения map

        TreeMap(SortedMap<K, ? extends V> smap): создает дерево, в которое добавляет все элементы из отображения smap

        TreeMap(Comparator<? super K> comparator): создает пустое дерево, где все добавляемые элементы впоследствии
        будут отсортированы компаратором.*/

import java.util.*;

public class TreeMapic {

    public static void main(String[] args) {

      TreeMap<Integer, String> states = new TreeMap<Integer, String>();
      states.put(10, "Germany");
      states.put(2, "Spain");
      states.put(14, "France");
      states.put(3, "Italy");

      // получим объект по ключу 2
      String first = states.get(2);
      // перебор элементов
      for(Map.Entry<Integer, String> item : states.entrySet()){

        System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
      }
      // получим весь набор ключей
      Set<Integer> keys = states.keySet();
      // получить набор всех значений
      Collection<String> values = states.values();

      // получаем все объекты, которые стоят после объекта с ключом 4
      Map<Integer, String> afterMap = states.tailMap(4);

      // получаем все объекты, которые стоят до объекта с ключом 10
      Map<Integer, String> beforeMap = states.headMap(10);

      // получим последний элемент дерева
      Map.Entry<Integer, String> lastItem = states.lastEntry();

      System.out.printf("Last item has key %d value %s \n",lastItem.getKey(), lastItem.getValue());

      Map<String, Person2> people = new TreeMap<String, Person2>();
      people.put("1240i54", new Person2("Tom"));
      people.put("1564i55", new Person2("Bill"));
      people.put("4540i56", new Person2("Nick"));

      for(Map.Entry<String, Person2> item : people.entrySet()){

        System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
      }
    }
  }
  class Person2{

    private String name;
    public Person2(String name){

      this.name = name;
    }
    String getName(){return name;}
  }


