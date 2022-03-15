package Streams;

import Method.ConstructorReferencing.Movie;

import java.util.*;

public class InternalAndExternalIterationStrategy {
    List<Movie> movies = new ArrayList<>();
    List<Movie> top2Classics = new ArrayList<>(10);

    private void testExternalIterationa1(){
        for(Movie m : movies){
            if(m.isClassic()){
                top2Classics.add(m);
            }
        }
        System.out.println("Top 2 classics " + top2Classics);
    }

    private void testInternalIteration1(){
        movies.parallelStream()
                .filter(Movie::isClassic)
                .map(Movie::name)
                .limit(2)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new InternalAndExternalIterationStrategy().testInternalIteration1();
        new InternalAndExternalIterationStrategy().testExternalIterationa1();
    }
}
