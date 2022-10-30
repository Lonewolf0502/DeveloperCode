public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};

        System.out.println(search(arr));


    }
    public static int search(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
                return index;
        }
        return -1;

    }
    public static void swap(int[] arr,int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }

}
