package Streams;

import Method.ConstructorReferencing.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    private void testCollectionStreams(){
        List<Movie> movies = new ArrayList<>();
        movies.stream().forEach(System.out::println);
    }

    private void testEmptyStreams(){
        Stream<Movie> moviesEmptyStream = Stream.empty();
        System.out.println("Empty stream: " + moviesEmptyStream);
    }

    private void testStreamsFromValues(){
        Stream<String> moviesName = Stream.of("ABCD", "Fiddler On The Roof");
        System.out.println(moviesName.count());

        String[] moviesName2 = {"ABCD", "Fiddler On The Roof"};
        Stream<String> mNames2 = Stream.of(moviesName2);
    }

    private void testFileStream(){
        try{
            Stream<String> fileLines = Files.lines(Paths.get("/fakePath/tep.txt"));
            fileLines.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void testGenerateFileIterateStreams(){
        Stream<Double> randomStream = Stream.generate(Math::random);

        //iterate
        Stream<Integer> wholeNumbers = Stream.iterate(1, i-> i+1);
        wholeNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamsFromValues();
        new CreatingStreams().testCollectionStreams();
        new CreatingStreams().testFileStream();
    }
}
