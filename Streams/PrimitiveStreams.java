package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

class Trade{
     int getCount(){
        return 200;
    }
}

public class PrimitiveStreams {

    List<Trade> trades = new ArrayList<>();

    private void tradeQuantity(){
        Optional<Integer> quantity =
                trades.stream().map(Trade::getCount).reduce(Integer::sum);
    }

    private void intStream(){
        int[] ints = new int[]{2,4,6,8,10};
        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream.of(2,4,6,8);
    }

    private void doubleStream(){
        double[] doubles = new double[]{2.0,4.2,6.4,8,10};
        DoubleStream doubleStream = DoubleStream.of(doubles); // passing the array
        doubleStream.forEach(System.out::println);

        DoubleStream.of(2,4,6,8); // directly passing the numbers
    }

    private void convertStreams(){
        int sumQuantity = trades.stream().mapToInt(Trade::getCount).sum();
    }

    public static void main(String[] args) {
        new PrimitiveStreams().tradeQuantity();
        new PrimitiveStreams().intStream();
        new PrimitiveStreams().doubleStream();
    }
}
