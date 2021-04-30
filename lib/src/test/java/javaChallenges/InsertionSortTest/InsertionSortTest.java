package javaChallenges.InsertionSortTest;

import javaChallenges.InsertionSort.InsertionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
  @Test
  public void testInsertionSort(){
    int[] test = new int[]{8,4,23,42,16,15};
    int[] expected = new int[]{4,8,15,16,23,42};
    int[] actual = InsertionSort.Sort(test);
    assertArrayEquals("Should return '[]'",expected,actual);
  }
  @Test
  public void testReverseSortedArray(){
    int[] test = new int[]{20,18,12,8,5,-2};
    int[] expected = new int[]{-2,5,8,12,18,20};
    int[] actual = InsertionSort.Sort(test);
    assertArrayEquals("Should return '[]'",expected,actual);
  }
  @Test
  public void testUniqueValues(){
    int[] test = new int[]{5,12,7,5,5,7};
    int[] expected = new int[]{5,5,5,7,7,12};
    int[] actual = InsertionSort.Sort(test);
    assertArrayEquals("Should return '[]'",expected,actual);
  }
  @Test
  public void testNearlySorted(){
    int[] test = new int[]{2,3,5,7,13,11};
    int[] expected = new int[]{2,3,5,7,11,13};
    int[] actual = InsertionSort.Sort(test);
    assertArrayEquals("Should return '[]'",expected,actual);
  }
}
