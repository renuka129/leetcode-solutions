class Solution {
    
    public int minimumPushes(String word) {
        int counter=0;
        int increment=1;
        int res=0;
        for(int i=0;i<word.length();i++){
            if(counter<8){
                res+=increment;
                counter++;
            }
            else if(counter>=8&&counter<16){
                increment++;
                res+=2;
                counter++;
            }
            else if(counter>=16&&counter<24){
                increment++;
                res+=3;
                counter++;
            }
            else{
                increment++;
                res+=4;
                counter++;
            }
        }
        return res;
    }
}