package lesson11;

import java.util.stream.Stream;

public class CollectionMain {
	public static void main(String[] args) {

		Stream.of("青", "赤", "黄").forEach(System.out::println);
	}
}
