class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int a[]=new int[26];
        int max=0;
        while(j<s.length()){
            int x=s.charAt(j)-'A';
            a[x]+=1;
            max=Math.max(a[x],max);
            if((j-i+1)-max>k){
                a[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return (j-i);
    }
}