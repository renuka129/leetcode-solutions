class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:num.toCharArray()){
            while(k>0&&sb.length()>0&&sb.charAt(sb.length()-1)>c){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(c);
        }
        sb.setLength(sb.length()-k);
        int s=0;
        while(s<sb.length()&&sb.charAt(s)=='0'){
            s++;
        }
        String ans=sb.substring(s);
    return ans.isEmpty()?"0":ans;
    }
}