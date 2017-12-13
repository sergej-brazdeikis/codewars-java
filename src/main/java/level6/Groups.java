package level6;

// http://www.codewars.com/kata/54b80308488cb6cd31000161/train/java

import java.util.LinkedList;

public class Groups {

  public static boolean groupCheck(String s) {

    LinkedList<Character> stack = new LinkedList<>();

    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
        case '(':
          stack.add(0, ')');
          break;
        case '[':
          stack.add(0, ']');
          break;
        case '{':
          stack.add(0, '}');
          break;
        case ')':
        case ']':
        case '}':
          if (stack.isEmpty() || !stack.remove().equals(s.charAt(i))) {
            return false;
          }
      }
    }

    return stack.isEmpty();
  }

}
