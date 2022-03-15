package Streams;

import Method.ConstructorReferencing.Movie;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithStreams {
    List<Movie> movies = new ArrayList<>();

    private void findMoviesByDirector(String director){
        movies
                .stream()
//                .filter(m -> m.getDirector().equals("Steven Spielberg") ? true : false)
                .map(Movie::name)
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new WorkingWithStreams().findMoviesByDirector("Steven Spielberg");
    }
}
