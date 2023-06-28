import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={2,3,1,9,0};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int j,int k){
        int temp=arr[k];
        arr[k]=arr[j];
        arr[j]=temp;
    }

    
}
