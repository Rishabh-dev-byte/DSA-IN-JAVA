class waterContainer {
    public int maxArea(int[] nums) {
        int max=0;
        int sum;
        int start=0;
        int end=nums.length-1;
        while(start<end){
              int height=end-start;
              int width;
              if(nums[start]<nums[end]){
                 width=nums[start];
              }
              else{
                 width=nums[end];
              }

              sum=height*width;
              if(sum>max){
                max=sum;
              }

              if(nums[start]>nums[end]){
                end--;
              }
              else{
                start++;
              }

        }
        return max;

    }
}