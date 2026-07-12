class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int count=1;
        Map<Integer,Integer>m=new HashMap<>();
        int temp[]=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(m.containsKey(temp[i])){
               continue;
            }
            m.put(temp[i],m.getOrDefault(temp[i],0)+count);
            count++;
        }
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                temp[i]=m.get(arr[i]);
            }
        }
        return temp;
    }
}