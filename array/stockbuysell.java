public class stockbuysell {
    
    public int maxProfit(int[] nums) {
        int profit;
        int maxProfit=0;
        int min=nums[0];
        
        for(int i=1;i<nums.length;i++){
               profit=nums[i]-min;

               if(profit>maxProfit){
                maxProfit=profit;
               }
               
               if(nums[i]<min){
                min=nums[i];
               }
               
        }
        if(maxProfit>0){
          return maxProfit;
        }

        else{
            return 0;
        }
       
    }
}

