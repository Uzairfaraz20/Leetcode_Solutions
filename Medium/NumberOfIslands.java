class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; //total count of islands
        
        //loop through all posiitons in the 2d array
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                //if we find a one
                if(grid[x][y] == '1'){
                    //finding a 1 guarentees an island so increment
                    count += 1;
                    //call the bfs function on this position
                    zeroifyBFS(grid,x,y);
                }
            }
        }
        
        return count;
    }
    
    
    //bfs helper to clear out an island of ones
    public void zeroifyBFS(char[][] grid, int x, int y){
        //if the position is out of bounds or 0, then leave it alone
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == '0'){return;}
        
        //clear the current position
        grid[x][y] = '0';
        
        //call bfs on all adjacent positions and clear out the island
        zeroifyBFS(grid,x+1,y);
        zeroifyBFS(grid,x-1,y);
        zeroifyBFS(grid,x,y+1);
        zeroifyBFS(grid,x,y-1);

        
    }
}