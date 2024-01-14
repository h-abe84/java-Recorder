package lesson11;

import java.util.stream.IntStream;

public class IntStreamSample {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		stream.filter(i -> i % 2 == 0).forEach(System.out::println);
	}
}