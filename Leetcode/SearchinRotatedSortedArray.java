class Solution {
    public int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if you don't find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target,0,nums.length - 1);
        }

        // if pivot is found, you have 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if( target >= nums[0]){
            return binarySearch(nums,target,0,pivot - 1);
        }

        return binarySearch(nums,target,pivot + 1,nums.length - 1);
    }

     int binarySearch(int[] arr, int target,int start, int end){

        while(start<=end){

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid +1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }

     int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <=end){
            int mid = (end - start) / 2 + start ;

            // 4 cases here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
