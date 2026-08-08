class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;

        while(start<=end){
            //compare target with midvalue
            if(nums[mid] == target){
                //target found
                return mid;

            }
            else if(target>nums[mid]){
                //go to the right side

                start = mid+1;
            }
            else{
                //target<nums[mid]
                //go to the left side
                end = mid-1;
            }
            //update mid
            mid = start + (end-start)/2;

        }
        //agar aap yaha tak aagye h iska mtlb ye h
        //target not found
        return -1;
        
    }
}