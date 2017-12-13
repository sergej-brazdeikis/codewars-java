package level6;

// http://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java

import java.util.stream.Collectors;

public class ExpandedForm {

  public static String expandedForm(int n) {
    Integer length = String.valueOf(n).length();
    final Integer[] k = {0};

    return String.valueOf(n).chars()
        .mapToObj(i -> {
          k[0]++;
          return (i - 48) * Math.pow(10, length - k[0]);
        })
        .mapToInt(Double::intValue)
        .filter(e -> e > 0)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" + "));
  }
}
