public class nextpermutation {
    
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n =nums.length;
        int left;
        int right;
        int count=0;
        for(int i=n-1;i>=1;i--){
            
           if(nums[i-1]<nums[i]){
              ind=i-1;
              break;
           }
        }

         if(ind==-1){
        left=0; right=n-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
        }

         else{
        for(int j=n-1;j>ind;j--){
            if(nums[ind]<nums[j]){
                int temp=nums[j];
                nums[j]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        left=ind+1; right=n-1;
        while(left<right  ){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
         }
       
        
    }
}

