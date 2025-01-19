class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet <Integer> set = new HashSet<>();
        int a=0, b=0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    a=grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int k=1; k<=grid.length*grid[0].length; k++){
            if(!set.contains(k)){
                b=k;
                break;
            }
        }
        return new int[] {a,b};
    }
}