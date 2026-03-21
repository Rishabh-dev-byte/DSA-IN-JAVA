public class rotatematrix {
    
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0;i<m;i++){
                int left=0;
                int right=n-1;
                  while(left<right){
                    int temp=matrix[i][right];
                    matrix[i][right]=matrix[i][left];
                    matrix[i][left]=temp;
                    left++;
                    right--;
                }
            
        }
        
    }
}

