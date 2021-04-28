package javaChallenges.mergeSortTest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class mergeSortTest {
  @Test
  public void testMergeSort(){
    int[] testArr = new int[]{8,4,23,42,16,15};
    int[] expected = new int[]{4,8,15,16,23,42};
    int[] actual = MergeSort.sort(testArr);
    System.out.print("Expected: [");
    for(int num: expected){
      System.out.print(num + " ");
    }
    System.out.print("]\n");

    System.out.print("Actual: [");
    for(int num: actual){
      System.out.print(num + " ");
    }
    System.out.print("]\n");
    assertArrayEquals("Arrays should be equal",expected,actual);
  }
  @Test
  public void testMergeSortReverse(){
    int[] testArr = new int[]{20,18,12,8,5,-2};
    int[] expected = new int[]{-2,5,8,12,18,20};
    int[] actual = MergeSort.sort(testArr);
    System.out.print("Expected: [");
    for(int num: expected){
      System.out.print(num + " ");
    }
    System.out.print("]\n");

    System.out.print("Actual: [");
    for(int num: actual){
      System.out.print(num + " ");
    }
    System.out.print("]\n");
    assertArrayEquals("Arrays should be equal",expected,actual);
  }
  @Test
  public void testMergeSortUnique(){
    int[] testArr = new int[]{5,12,7,5,5,7};
    int[] expected = new int[]{5,5,5,7,7,12};
    int[] actual = MergeSort.sort(testArr);
    System.out.print("Expected: [");
    for(int num: expected){
      System.out.print(num + " ");
    }
    System.out.print("]\n");

    System.out.print("Actual: [");
    for(int num: actual){
      System.out.print(num + " ");
    }
    System.out.print("]\n");
    assertArrayEquals("Arrays should be equal",expected,actual);
  }
  @Test
  public void testMergeSortNearlySorted(){
    int[] testArr = new int[]{2,3,5,7,13,11};
    int[] expected = new int[]{2,3,5,7,11,13};
    int[] actual = MergeSort.sort(testArr);
    System.out.print("Expected: [");
    for(int num: expected){
      System.out.print(num + " ");
    }
    System.out.print("]\n");

    System.out.print("Actual: [");
    for(int num: actual){
      System.out.print(num + " ");
    }
    System.out.print("]\n");
    assertArrayEquals("Arrays should be equal",expected,actual);
  }
}
