class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack<>();
        int j=0;
        boolean alive=true;
        while(j<asteroids.length){
            while(!s.isEmpty()&&(s.peek()>0&&asteroids[j]<0)){
                if(s.peek()<Math.abs(asteroids[j])){
                    s.pop();
                }
                else if(s.peek()>Math.abs(asteroids[j])){
                    alive=false;
                    break;
                }
                else if(s.peek()==Math.abs(asteroids[j])){
                    alive=false;
                    s.pop();
                    break;
                } 
            }
                if(alive){
                s.push(asteroids[j]);
                }
                alive=true;
        j++;
        }
        int ans[]=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=s.pop();
        }
        return ans;
    }
}