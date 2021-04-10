package javaChallenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayShiftTest
  {
    @Test public void testArrayShift(){
      int[] arr = {2,5,6,8};
      int expectedOutput = 5;
      int actualOutput = ArrayShift.insertShiftArray(arr,5).length;
      assertEquals("Array sizes should match",expectedOutput,actualOutput);

      int[] arr2 = {3,6,9,12};
      int[] expectedOutput2 = {3,6,5,9,12};
      int[] actualOutput2 = ArrayShift.insertShiftArray(arr2,5);
      assertArrayEquals("Array should include 5 at index 2",expectedOutput2,actualOutput2);
    }

    @Test public void testRemoveMiddleVal(){
      int[] arr = {2,4,5,6,8};
      int[] expectedOutput3 = {2,4,6,8};
      int[] actualOutput3 = ArrayShift.removeMiddleVal(arr);
      assertArrayEquals(
        "Should remove the middle value",
        expectedOutput3,
        actualOutput3
      );
    }
}
