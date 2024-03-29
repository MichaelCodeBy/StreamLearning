/*
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Potoki {

   public static void main(String[] args) {


   //метод Arrays.stream(T[] array), который создает поток данных из массива:
  Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
citiesStream.forEach(s->System.out.println(s)); // выводим все элементы массива

     //  Для создания потоков IntStream, DoubleStream, LongStream можно использовать соответствующие перегруженные версии этого метода:
       IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
       intStream.forEach(i->System.out.println(i));

       LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
       longStream.forEach(l->System.out.println(l));

       DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
       doubleStream.forEach(d->System.out.println(d));

       //И еще один способ создания потока представляет статический метод of(T..values) класса Stream:
       Stream<String> citiesStream =Stream.of("Париж", "Лондон", "Мадрид");
       citiesStream.forEach(s->System.out.println(s));

// можно передать массив
       String[] cities = {"Париж", "Лондон", "Мадрид"};
       Stream citiesStream2 =Stream.of(cities);

       IntStream intStream = IntStream.of(1,2,4,5,7);
       intStream.forEach(i->System.out.println(i));

       LongStream longStream = LongStream.of(100,250,400,5843787,237);
       longStream.forEach(l->System.out.println(l));

       DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
       doubleStream.forEach(d->System.out.println(d));
   }

}
*/