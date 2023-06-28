import java.util.Arrays;

public class Selection {
    public static void main(String[] args) { 
        int[] arr={1,3,6,2,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    
    static void swap(int[] arr,int maxIndex,int last){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }

    static int findMaxIndex(int[] array, int start, int end){
        int max=start;
        for(int i=start+1;i<=end;i++){
            if(array[i]>array[max]){
                max=i;
            }
        }
        return max;
    }
    
}
