class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List <List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k % total;

        for(int i=0; i<m ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                int index = i*n+j;
                int oldIndex = (index - k + total) % total;
                int oldRow = oldIndex / n;
                int oldCol = oldIndex % n;
                row.add(grid[oldRow][oldCol]);
            }
        ans.add(row);
        }
    return ans;        
    }
}