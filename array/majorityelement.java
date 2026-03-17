class majorityElement {
    public int majorityElement(int[] nums) {
        int major=0;
        int j=0;
        int hash[] = new int[5*10000];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);   
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) > nums.length/2){
                major=nums[i];

            }
            
        }
       return major;
    }
}