package array;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
            int sum = nums[i]+nums[j];
            if(sum==target){
                arr = new int[]{i, j};
            }
        }

    }
    return arr;
    }

}