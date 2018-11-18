package level7;

public class Vowels {

  public static int getCount(String s) {
    int vowelsCount = 0;

    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          vowelsCount++;
          break;
        default:
          // do nothing
      }
    }

    return vowelsCount;
  }
}
