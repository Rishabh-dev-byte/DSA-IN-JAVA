public class arrangebysign {
    
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int k=1;
        int arr[] = new int[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j]>=0){
                arr[i]=nums[j];
                i+=2;
            }
            else if(nums[j]<0){
                arr[k]=nums[j];
                   k+=2;

            }
            
        }
    
        for(int z=0;z<=arr.length-1;z++){
            nums[z] = arr[z];
            
        }
        return nums;
    }
}

