package javaChallenges.QuickSort;

public class QuickSort {
  public static int[] performQuickSort(int[] array){
    _quickSort(array,0,array.length-1);
    return array;
  }
  public static void _quickSort(int[] array, int startIdx, int endIdx){
    if(startIdx >= endIdx)return;
    int pivotIdx = startIdx;
    int leftIdx = startIdx + 1;
    int rightIdx = endIdx;

    while(rightIdx >= leftIdx){
      boolean leftPointerIsBigger = array[leftIdx] > array[pivotIdx];
      boolean rightPointerIsBigger = array[rightIdx] > array[pivotIdx];
      if(leftPointerIsBigger && !rightPointerIsBigger){
        swap(leftIdx,rightIdx,array);
      }
      if(array[leftIdx] <= array[pivotIdx]){
        leftIdx++;
      }
      if(array[rightIdx] >= array[pivotIdx]){
        rightIdx--;
      }
    }

    swap(pivotIdx,rightIdx,array);

    boolean leftSubarrayIsSmaller = (rightIdx - 1) - startIdx < (rightIdx + 1);
    if(leftSubarrayIsSmaller){
      _quickSort(array,startIdx,rightIdx - 1);
      _quickSort(array,rightIdx + 1,endIdx);
    }else{
      _quickSort(array,rightIdx + 1,endIdx);
      _quickSort(array,startIdx,rightIdx - 1);
    }
  }
  public static void swap(int left,int right, int[] array){
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
  }
}
