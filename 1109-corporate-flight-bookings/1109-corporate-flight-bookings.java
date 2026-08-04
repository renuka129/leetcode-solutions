class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int []res=new int[n];
        for(int i=0;i<bookings.length;i++){
            int f=bookings[i][0];
            int l=bookings[i][1];
            int d=bookings[i][2];
            res[f-1]+=d;
            if((l)<n){
            res[l]-=d;
            }
        }
        for(int i=1;i<res.length;i++){
            int c=res[i-1];
            res[i]=c+res[i];
        }
        return res;
    }
}