package level6;

// https://www.codewars.com/kata/sum-of-digits-slash-digital-root/train/java
public class DRoot {

  // weird function naming convention because of tests on CodeWars
  public static int digital_root(int n) {

    n = String.valueOf(n).chars()
        .reduce(0, (c, e) -> c + e - 48);

    if (n >= 10) {
      return digital_root(n);
    }

    return n;
  }
}
