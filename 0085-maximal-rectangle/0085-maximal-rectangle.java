class Solution {
    public int maximalRectangle(char[][] matrix) {
        int a[]=new int[matrix[0].length];
        int max=0;
        for(int j=0;j<matrix.length;j++){
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[j][i]=='1'){
                a[i]++;
            }
            else{
                a[i]=0;
            }
        } 
        int h=histogram(a); 
        max=Math.max(h,max);
        }
        return max;
    }
    int histogram(int []a){
        int j=0;
        int l=0;
        int r=0;
        int area=0;
        int w=0;
        int max=0;
        int h=0;
        Stack<Integer>s=new Stack<>();
        while(j<a.length){
        while(!s.isEmpty()&&a[s.peek()]>a[j]){
             h=s.pop();
            if(!s.isEmpty()){
             l=s.peek();
            }else{
                l=-1;
            }
            r=j;
            w=r-l-1;
            area=a[h]*w;

            max=Math.max(area,max);
        }
        s.push(j);
        j++;
        }
        while(!s.isEmpty()){
                    h=s.pop();
                    r=a.length;
                    if(!s.isEmpty()){
                    l=s.peek();}
                    else{
                        l=-1;
                    }
                    w=(r-l-1);
                    area=a[h]*w;
                    max=Math.max(area,max);
        }
        return max;
    }
}