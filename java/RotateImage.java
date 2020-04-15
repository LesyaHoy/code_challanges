/**
You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        int middle = n/2;
        
        for (int i = 0; i< middle; i++){
            for(int j = i; j< n-1-i; j++){
                int rotateRowI = i;
                int rotateColumnI = j;
                
                int itemToPut = matrix[rotateRowI][rotateColumnI];
                
                int step = 0;
                int itemToBeReplaced;
                
                
                do{
                    itemToBeReplaced = matrix[rotateColumnI][n - 1 - rotateRowI];
                    matrix[rotateColumnI][n - 1 - rotateRowI]=
                        itemToPut;
                    itemToPut = itemToBeReplaced;
                    
                    int oldRotateCol = rotateColumnI;
                    rotateColumnI=n - 1 - rotateRowI;
                    rotateRowI=oldRotateCol;
                    step++;
                }
                while(step<4);
            }
        }
    }
}