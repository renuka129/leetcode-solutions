class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>s=new Stack<>();
        int j=0;
        int h=0;
        int r=0;//rightboundary
        int l=0;//leftboundary
        int w=0;//width(r-l-1);
        int a=0;//h*w;
        int max=0;//area can never be negative so no min_length
        while(j<heights.length){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[j]){
                    h=heights[s.pop()];
                    r=j;
                    if(!s.isEmpty()){
                    l=s.peek();}
                    else{
                        l=-1;
                    }
                    w=(r-l-1);
                    a=h*w;
                    max=Math.max(a,max);
            }
                s.push(j);
            j++;
        }//remaimg elements acna ne in the array they will be //not calculated so use right boundary as n and calculate it 
        while(!s.isEmpty()){
            h=heights[s.pop()];
                    r=heights.length;
                    if(!s.isEmpty()){
                    l=s.peek();}
                    else{
                        l=-1;
                    }
                    w=(r-l-1);
                    a=h*w;
                    max=Math.max(a,max);
        }
        return max;
    }
}