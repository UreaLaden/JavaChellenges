package javaChallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
  @Test
  public void TestBinarySearch(){
    int[] arr1 = {4,8,15,16,23,42};
    int expectedOutput1 = 2;
    int actualOutput = BinarySearch.findTarget(arr1,15);
    assertEquals("Should return index 2 ",expectedOutput1,actualOutput);

    int[] arr2 = {4,8,15,16,23,42};
    int expectedOutput2 = -1;
    int actualOutput2 = BinarySearch.findTarget(arr1,-15);
    assertEquals("Should return -1 for numbers not in the array ",expectedOutput2,actualOutput2);

    int[] arr3 = {4,8,15,16,23,42};
    int expectedOutput3 = -1;
    int actualOutput3 = BinarySearch.findTarget(arr1,50);
    assertEquals("Should return -1 for numbers not in the array ",expectedOutput3,actualOutput3);
  }
}
