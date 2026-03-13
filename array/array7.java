class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<=nums.length-1;i++){
            count=i;
            if(nums[i] == 0){
             j=i;
            break;
            }
        }

        for(i=j+1;i<=nums.length-1;i++){
            if(count==nums.length-1) break;
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;
                j++;
            
            }
        }
        
    }
}