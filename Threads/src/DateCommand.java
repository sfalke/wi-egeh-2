import java.time.LocalDateTime;
import java.util.stream.Stream;

public class DateCommand implements Runnable {

    @Override
    public void run(){
        Stream.generate( LocalDateTime::now).limit(1000).forEach(System.out::println);
    }

}
