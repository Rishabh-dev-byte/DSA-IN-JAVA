class matrix0 {
    public void setZeroes(int[][] nums) {
       int m=nums.length;
       int n=nums[0].length;
       int col=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(nums[i][j]==0){
                // make the ith row zero
                nums[i][0]=0;
                // make the ith column zero
                if(j==0){
                  col=0;
                }
                else{
                    nums[0][j]=0;
                }
               }
            }
        }

          for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
               if(nums[i][j] != 0){
                   if(nums[0][j]==0 || nums[i][0]==0){
                       nums[i][j]=0;
                   }
                   
               }
            }
        }
        
          if(nums[0][0]==0){
            for(int j=0;j<n;j++){
                nums[0][j]=0;
            }
        }



        if(col==0){
            for(int i=0;i<m;i++){
                nums[i][0]=0;
            }
        }
      
    }
}