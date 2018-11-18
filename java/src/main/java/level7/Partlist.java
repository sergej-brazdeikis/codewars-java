package level7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java
public class Partlist {

  public static String[][] partlist(String[] a) {
    String[][] result = new String[a.length - 1][2];

    IntStream.range(0, a.length - 1).forEach(i -> {
      result[i][0] = Arrays.stream(a).limit(i + 1).collect(Collectors.joining(" "));
      result[i][1] = Arrays.stream(a).skip(i + 1).collect(Collectors.joining(" "));
    });

    return result;
  }
}
