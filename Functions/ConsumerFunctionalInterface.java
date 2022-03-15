package Functions;
import java.util.function.Consumer;
import Method.ConstructorReferencing.Movie;


public class ConsumerFunctionalInterface {

    Consumer<Movie> printInfo = m -> System.out.println("Movie: " + m.name());
    Consumer<Movie> persistMovie = m -> persist(m);

    private void testConsumer(Movie m){
        printInfo.accept(m);
        persistMovie.accept(m);
    }

    public void testAndThen(Movie m){
        Consumer<Movie> print = persistMovie.andThen(printInfo);
        print.accept(m);
    }

    private void persist(Movie m){
        System.out.println("Persisting movie: " + m.name());
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Avengers");
        new ConsumerFunctionalInterface().testConsumer(movie);
        new ConsumerFunctionalInterface().testAndThen(movie);
    }
}
