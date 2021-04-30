package javaChallenges.InsertionSort;

public class InsertionSort {
  public static int[] Sort(int[] array){
    for(int i=1;i<array.length;i++){
      int j=i;
      while(j > 0 && array[j] < array[j-1] ){
        swap(j,j-1,array);
        j--;
      }
    }
    return array;
  }
  private static void swap(int left,int right,int[] array){
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
  }
}
