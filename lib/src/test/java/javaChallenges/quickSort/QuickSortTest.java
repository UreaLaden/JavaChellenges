package javaChallenges.quickSort;

import javaChallenges.QuickSort.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
  @Test
  public void testReverseSorted(){
    int[] array = new int[]{20,18,12,8,5,-2};
    int[] expected = new int[]{-2,5,8,12,18,20};
    int[] actual = QuickSort.performQuickSort(array);
    assertArrayEquals("Should return '[-2,5,8,12,18,20]'",expected,actual);
  }
  @Test
  public void testUniqueValues(){
    int[] array = new int[]{5,12,7,5,5,7};
    int[] expected = new int[]{5,5,5,7,7,12};
    int[] actual = QuickSort.performQuickSort(array);
    assertArrayEquals("Should return '[5,5,5,7,7,12]'",expected,actual);
  }
  @Test
  public void testNearlySorted(){
    int[] array = new int[]{2,3,5,7,13,11};
    int[] expected = new int[]{2,3,5,7,11,13};
    int[] actual = QuickSort.performQuickSort(array);
    assertArrayEquals("Should return '[2,3,5,7,11,13]'",expected,actual);
  }
}
