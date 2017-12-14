package level5;

// http://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/train/java
public class StringMerger {

  public static boolean isMerge(String s, String part1, String part2) {

    if (s.isEmpty()) {
      return part1.isEmpty() && part2.isEmpty();
    }

    if (part1.isEmpty() && part2.isEmpty()){
      return false;
    }

    if (part1.length() == 0) {
      return s.charAt(0) == part2.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1));
    }

    if (part2.length() == 0) {
      return s.charAt(0) == part1.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2);
    }

    return (s.charAt(0) == part1.charAt(0) || s.charAt(0) == part2.charAt(0))
        && (
        isMerge(s.substring(1), part1.substring(1), part2)
            || isMerge(s.substring(1), part1, part2.substring(1)));
  }

}