
import java.util.ArrayList;
import java.util.Collections;

// default Stream <E> stream - возвращается поток данных из коллекции
// default Stream <E> parallelStream - возвращается паралельный поток данных из коллекции
public class CreatStream1 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Madrid");
        cities.stream() //получаем поток
                .filter(s -> s.length()==6) //фильтрация по длинне строки
                .forEach(s->System.out.println(s));//вывод отфильтрованные строки на консоль
    }
}
