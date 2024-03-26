import java.util.stream.IntStream;

public class CounterCommand implements Runnable {

    @Override
    public void run(){
        IntStream.range(0, 1000).forEach(System.out::println);
    }

}
