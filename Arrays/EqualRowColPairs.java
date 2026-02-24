/* Problem: Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).*/

class Solution {
    public int equalPairs(int[][] grid) {

        int n = grid.length;
        int count = 0;

        for (int row=0; row<n; row++){
            for (int col=0; col<n; col++){
                boolean isEqual = true;

                for (int k=0; k<n; k++){
                    if (grid[row][k] != grid[k][col]){
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual){
                    count++;
                }
            }
        }
        return count;
        
    }
}

 
