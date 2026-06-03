import java.util.HashMap;
import java.util.Map;

public class RepeatMissing {
    
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       Map<Integer,Integer> nums=new HashMap<>();
       int doubl=0;
       int m=grid.length;
       int n=grid[0].length;
       int n2=m*m;
       int missing=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            nums.put(grid[i][j],nums.getOrDefault(grid[i][j],0)+1);
        }
       }
      
       for(int k=1;k<=n2;k++){
         int freq=nums.getOrDefault(k,0);
           if(freq==2) doubl=k;
           if(freq==0) missing=k;
        
       }
       return new int[]{doubl,missing};
    }
}

