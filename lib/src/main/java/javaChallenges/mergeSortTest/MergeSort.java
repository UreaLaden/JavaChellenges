package javaChallenges.mergeSortTest;

import java.util.Arrays;

public class MergeSort {

  public static int[] sort(int[] array){
    if(array.length == 1)return array;

    int middleIdx = array.length / 2;
    int[] leftHalf = Arrays.copyOfRange(array,0,middleIdx);
    int[] rightHalf = Arrays.copyOfRange(array,middleIdx,array.length);

    return mergeSortedArrays(sort(leftHalf),sort(rightHalf));
  }
  public static int[] mergeSortedArrays(int[] leftHalf, int[] rightHalf){
    int[] sortedArray = new int[leftHalf.length + rightHalf.length];

    int leftPointer = 0;
    int rightPointer = 0;
    int resultIdx = 0;

    while(leftPointer < leftHalf.length && rightPointer < rightHalf.length){
      if(leftHalf[leftPointer] <= rightHalf[rightPointer]){
        sortedArray[resultIdx] = leftHalf[leftPointer];
        leftPointer++;
      }else{
        sortedArray[resultIdx] = rightHalf[rightPointer];
        rightPointer++;
      }
      resultIdx++;
    }
    while(leftPointer < leftHalf.length){
      sortedArray[resultIdx] = leftHalf[leftPointer];
      leftPointer++;
      resultIdx++;
    }
    while(rightPointer < rightHalf.length){
      sortedArray[resultIdx] = rightHalf[rightPointer];
      rightPointer++;
      resultIdx++;
    }
    return sortedArray;
  }
}
