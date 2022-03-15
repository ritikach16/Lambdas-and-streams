package Streams;

import Method.ConstructorReferencing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collecting {
    List<Trade> trades = new ArrayList<>();

    private void collectIntoAList(){
        List<Trade> tradeCollection = trades.stream().collect(Collectors.toList());
        System.out.println(tradeCollection);
    }

    private void collectIntoASet(){
        Set<Trade> tradeCollection = trades.stream().collect(Collectors.toSet());
        System.out.println(tradeCollection);
    }

    private void collectIntoAMap(){
        List<ConstructorReferencing.Movie> movies = new ArrayList<>();
        Map<String, ConstructorReferencing.Movie> tradeCollection = movies
                .stream()
                .collect(Collectors.toMap(ConstructorReferencing.Movie::name, movie -> movie));
        System.out.println(tradeCollection);
    }

    public static void main(String[] args) {
        new Collecting().collectIntoAList();
        new Collecting().collectIntoAMap();
        new Collecting().collectIntoASet();
    }
}
