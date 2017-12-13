package level6;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpandedFormTest {

  @Test
  public void expandedForm() {
    assertEquals("10 + 2", ExpandedForm.expandedForm(12));
    assertEquals("40 + 2", ExpandedForm.expandedForm(42));
    assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304));
  }

}