package level5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringMergerTest {

  @Test
  public void normalHappyFlow() {
    assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
    assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
  }

  @Test
  public void canHandleEmptyStrings() {
    assertFalse("codewars can be created from code and wars", StringMerger.isMerge("codewars", "", "wars"));
    assertFalse("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", ""));
    assertFalse("'' cannot be created from code and wars", StringMerger.isMerge("", "code", "wars"));
    assertFalse("'' cannot be created from '' and wars", StringMerger.isMerge("", "", "wars"));
    assertTrue("'' cannot be created from '' and ''", StringMerger.isMerge("", "", ""));
  }

  @Test
  public void canHandleCharactersInWrongOrder() {
    assertFalse("codewars can be created from code and wasr", StringMerger.isMerge("codewars", "code", "wasr"));
  }

  @Test
  public void canHandleExtraChars() {
    assertFalse("codewars is not codewarss", StringMerger.isMerge("codewars", "code", "warss"));
  }

  @Test
  public void someMoreRandomCases() {
    assertTrue("'POQIckpcD^.Y.' is a merge of 'POQc^.' and 'IckpD.Y'",
        StringMerger.isMerge("POQIckpcD^.Y.", "POQc^.", "IckpD.Y"));
  }

  @Test
  public void canHandleTooFewChars(){
    assertFalse("codewars can be created from code and wars", StringMerger.isMerge("codewars", "co", "de"));
  }

}