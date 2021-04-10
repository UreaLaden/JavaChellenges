package javaChallenges;

public class ArrayShift{
    public static int[] insertShiftArray(int[] arr,int num){
      int[] result = new int[arr.length+1];
      int mid = arr.length / 2;
      result[mid] = num;
      System.out.print("[ ");
      for(int i=0;i<result.length;i++){
        if(i == mid)
        {
          System.out.print(result[mid] + " ");
          continue;
        }
        else
        {
          result[i] = i > mid ? arr[i-1] : arr[i];
        }
        System.out.print(result[i] + " ");
      }
      System.out.print(" ] \n");
      return result;
    }

    public static int[] removeMiddleVal(int[] array){
      int[] result = new int[array.length-1];
      int mid = array.length / 2;
      System.out.println();
      System.out.println("Result: ");
      System.out.print(" [ ");
      for(int i=0;i<result.length;i++){
//        System.out.println("Val: " + array[i]);
        if(i > mid)
        {
          result[i] = array[i+1];
        }
        else
        {
          result[i] = i == mid ? array[i+1]:array[i];
        }
        System.out.print(result[i] + " ");
      }
      System.out.print(" ] \n");
      return result;
    }
  }
