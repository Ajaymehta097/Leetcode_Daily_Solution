class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value = grid[i][j];
                map.put(value,map.getOrDefault(value,0)+1);
            }
        }
        int repeated = 0;
        int missing = 0;
        for(int i=1;i<=n*n;i++){
            if(map.getOrDefault(i,0) == 2){
                repeated = i;
            }
            if(map.getOrDefault(i,0) == 0){
                missing = i;
            }
        }
    return new int[]{repeated,missing}; 
    }
}