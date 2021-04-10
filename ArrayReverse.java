
public class ArrayReverse{
    public static void main(String[] args){
        int[] array = {3,6,8,9,7,12,17};
        for(int num:array){
            System.out.print(num + " ");
        }
        System.out.println("");
        for(int num:reverseArray(array)){
            System.out.print(num + " ");
        }
    }

    public static int[] reverseArray(int[]array){
        int counter = 0;
        int mid = array.length / 2;
        int left = 0;
        int right = array.length -1;
        while(counter < mid){
            swap(left,right,array);
            left++;
            right--;
            counter++;
        }
        return array;
    }
    
    public static void swap(int leftIdx, int rightIdx, int[] array){
        int temp;
        temp = array[leftIdx];
        array[leftIdx]  = array[rightIdx];
        array[rightIdx] = temp;  
                       
    }
}