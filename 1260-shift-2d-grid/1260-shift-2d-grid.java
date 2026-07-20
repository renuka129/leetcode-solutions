class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int a[][]=new int[grid.length][grid[0].length];
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int index=i*grid[0].length+j;
                int newindex=(index+k)%(grid.length*grid[0].length);
                int newrow=newindex/grid[0].length;
                int newcol=newindex%grid[0].length;
                a[newrow][newcol]=grid[i][j];
            }
        }
         for(int i=0;i<grid.length;i++){
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l.add(a[i][j]);
            }
            res.add(l);
        }
        return res;
    }
}