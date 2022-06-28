import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
       /* int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){

            if(i > 0) count++;
        }
        System.out.println(count);
*/
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);
    }
}

// interface BaseStream<T , S extends BaseStream<T , S>>
// T- тип данных в потоке
// S - тип потока который наследуется от интерфейса BaseStream
