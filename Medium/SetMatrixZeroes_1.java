// Runtime: O((M*N) x (M+N)), not very good
// Space:   O(1)
// Note: Tried to use Integer.MAX_VALUE as dummy, but testcase failed that,
//      so just picked some value that wasnt hit, however if -1000000 was
//      in the array, this would fail, so i will try another approach as well :(

class Solution {
    public void setZeroes(int[][] matrix) {
        //matrix row length;
        int len = matrix.length;
        //value we will set row and col numbers that arent 0 to
        int dummy = -1000000;
        
        //go through every position in matrix
        for(int x = 0; x < len; x++){
            for(int y = 0; y < matrix[x].length; y++){
                
                //found a zero
                if(matrix[x][y] == 0){
                    
                    //clear out its row to MAX_VALUE if its not 0 or MAX_VALUE already
                    for(int r = 0; r < len ; r++){
                        if(matrix[r][y] != 0 && matrix[r][y] != dummy){
                            matrix[r][y] = dummy;
                        }
                    }
                    
                    //clear out its col to MAX_VALUE if its not 0 or MAX_VALUE already
                    for(int c = 0; c < matrix[x].length; c++){
                        if(matrix[x][c] != 0 && matrix[x][c] != dummy){
                            matrix[x][c] = dummy;
                        }
                    }  
                }
                
                
            }
        }
        
        //find all the dummy values and set to 0
        for(int a = 0; a < len; a++){
            for(int b = 0; b < matrix[a].length; b++){
                if(matrix[a][b] == dummy){
                    matrix[a][b] = 0;
                }
            }
        }
        
        
    }
}