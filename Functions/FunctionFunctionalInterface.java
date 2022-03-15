package Functions;
import Method.ConstructorReferencing.Movie;

import java.util.function.Function;

public class FunctionFunctionalInterface {
    Function<String, Movie> createMovieFunction = s -> new Movie(1, s);

    private void testFunction(String movieName){
        Movie movie = createMovieFunction.apply(movieName);
        System.out.println("Movie is: " + movie.name());
    }

    public static void main(String[] args) {
        new FunctionFunctionalInterface().testFunction("Avengers");
    }
}
