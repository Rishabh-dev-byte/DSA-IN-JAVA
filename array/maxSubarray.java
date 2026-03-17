// to print the max of the subarray
class maxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = -100000;

        int newstart;
        int start;
        int end;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;

            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}

// to print the max sub array

// class maxSubArray {
// public int maxSubArray(int[] nums) {
// int sum=0;
// int max = -100000;

// int newstart;
// int start;
// int end;
// for(int i=0;i<nums.length;i++){
// if(sum==0) start=i;
// sum += nums[i];

// if(sum>max){
// max=sum;
// newstart=start;
// end=i;

// }

// if(sum<0){
// sum=0;
// }
// }
// return max;
// }
// }