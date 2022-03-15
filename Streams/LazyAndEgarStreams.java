package Streams;

import Method.ConstructorReferencing.Movie;
import java.util.*;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LazyAndEgarStreams {
    List<Movie> movies = new ArrayList<>();

    private void testLazy(){
        movies.stream().filter(m -> {
            System.out.println("Inside Lazy Operation");
            return m.isClassic() ? true : false;
        }).count();
    }

    private void testEager(){
        Stream<Movie> movieStream = movies.stream().filter(m -> {
            System.out.println("Filtering");
            return m.isClassic() ? true : false;
        }).map(s -> {
            System.out.println("Mapping");
            return s;
        });

        System.out.println(" " + movieStream.count());
    }

    public static void main(String[] args) {
        new LazyAndEgarStreams().testLazy();
        new LazyAndEgarStreams().testEager();
    }
}
