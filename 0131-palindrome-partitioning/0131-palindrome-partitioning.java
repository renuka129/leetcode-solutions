class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>l=new ArrayList<>();
        f1(res,l,0,s);
        return res;
    }

    void f1(List<List<String>>res,List<String>l,int ind,String s){
        if(ind==s.length()){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(f(s,ind,i)){
                l.add(s.substring(ind,i+1));
                f1(res,l,i+1,s);
                l.remove(l.size()-1);
            }
        }
    }
     boolean f(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
     }
}