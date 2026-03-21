public class sortedandrotated {
    
    public boolean check(int[] nums) {
        int count=0;
        for(int i=1;i<=nums.length-1;i++){
             if(nums[i-1]>nums[i]){
                count++;
             }
        }
        if(count==0){
            return true;
        }
         if(count==1){
         if(nums[nums.length-1] <= nums[0]){
                return true;
                }
         }
        return false;
    }
}
