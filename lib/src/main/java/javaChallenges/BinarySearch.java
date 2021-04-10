package javaChallenges;

public class BinarySearch{
  public static int findTarget(int[] arr,int target){
    int left = 0;
    int right = arr.length - 1;

    if(arr[left] == target || arr[right] == target){
      return arr[left] == target ? left : right;
    }
    int middle = right / 2;
    while(left < right){
      if(arr[middle] == target){
        System.out.println(middle);
        return middle;
      }
      if(arr[middle] > target){
        right = middle;

      }
      if(arr[middle] < target){
        left = middle;
      }
      left++;
      right--;
      middle = right / 2;
    }
    System.out.println(-1);
    return -1;
  }
}
