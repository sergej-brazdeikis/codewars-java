package level6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BitCountingTest {

  @Test
  public void gameTest() {
    assertEquals(BitCounting.countBits(1234), 5);
    assertEquals(BitCounting.countBits(4), 1);
    assertEquals(BitCounting.countBits(7), 3);
    assertEquals(BitCounting.countBits(9), 2);
    assertEquals(BitCounting.countBits(10), 2);
  }
}