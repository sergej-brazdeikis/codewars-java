package level6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroupsTest {

  @Test
  public void myTests() {
    assertEquals(true, Groups.groupCheck("()"));
    assertEquals(false, Groups.groupCheck("({"));
  }

  @Test
  public void testOpenOrPrematurelyClosedGroups() {
    assertEquals(false, Groups.groupCheck("))))"));
    assertEquals(false, Groups.groupCheck("{(})"));
    assertEquals(false, Groups.groupCheck("([]"));
    assertEquals(false, Groups.groupCheck("[])"));
  }

  @Test
  public void testBadlyMatchedGroups() {
    assertEquals(false, Groups.groupCheck("{(})"));
    assertEquals(false, Groups.groupCheck("([]"));
    assertEquals(false, Groups.groupCheck("[])"));
  }
}
