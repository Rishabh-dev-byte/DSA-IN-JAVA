
// brute force approach

// class majorityElement {
//     public int majorityElement(int[] nums) {
//         int major=0;
//         int j=0;
//         int hash[] = new int[5*10000];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);   
//         }

//         for(int i=0;i<nums.length;i++){
//             if(map.get(nums[i]) > nums.length/2){
//                 major=nums[i];

//             }
            
//         }
//        return major;
//     }
// }

// optimal approach

 class majorityElement {
   public int majorElement(int[] nums) {
          int element=nums[0];
          int count=0;
          int max;
          for(int i=0;i<nums.length;i++){
              if(count==0){
                element=nums[i];
                
              }
              if(nums[i]==element){
                count++;
                            }

              else{
                count--;
              }
              
          }
            count=0;
           for(int i=0;i<nums.length;i++){
              if(nums[i]==element){
                count++;
              
              }
               
              if(count>nums.length/2){
                    return element;
                }
            
              
          }
          return -1;
    }
}