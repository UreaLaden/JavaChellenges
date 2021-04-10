package javaChallenges;

import javaChallenges.utilities.MultiBracketValidation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiBracketValidationTest {

  @Test
  public void testBasicTest(){
    String testInput =  "{}";
    boolean expected = true;
    boolean actual = MultiBracketValidation.multiBracketValidation(testInput);
    assertEquals("Should return true: ",expected, actual);
  }
  @Test
  public void testIsBalanced(){
    String testInput =  "{()}";
    boolean expected = true;
    boolean actual = MultiBracketValidation.multiBracketValidation(testInput);
    assertEquals("Should return true: ",expected, actual);
  }
  @Test
  public void testUnbalanced(){
    String testInput = "[({}]";
    boolean expected = false;
    boolean actual = MultiBracketValidation.multiBracketValidation(testInput);
    assertEquals("Should return false on unbalance: ",expected,actual);
  }
}
