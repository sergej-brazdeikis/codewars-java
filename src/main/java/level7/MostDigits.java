package level7;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/most-digits/train/java

public class MostDigits {

  public static int findLongest(int[] numbers) {

    int min = IntStream.of(numbers).min().getAsInt();
    int max = IntStream.of(numbers).max().getAsInt();

    return Math.abs(min) >= Math.abs(max) ? min : max;
  }
}
