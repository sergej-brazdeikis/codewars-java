package level7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelCountTest {

  @Test
  public void testCase1() {
    assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
  }

}
