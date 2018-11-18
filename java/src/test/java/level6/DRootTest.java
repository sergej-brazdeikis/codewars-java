package level6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DRootTest {

  @Test
  public void Tests() {
    assertEquals(7, DRoot.digital_root(16));
    assertEquals(6, DRoot.digital_root(942));
    assertEquals(6, DRoot.digital_root(132189));
    assertEquals(2, DRoot.digital_root(493193));
  }
}