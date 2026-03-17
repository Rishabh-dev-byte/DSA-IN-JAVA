class maxSubArray {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = -100000;
       for(int i=0;i<nums.length;i++){
                sum += nums[i];

            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
       }
       return max;
    }
}