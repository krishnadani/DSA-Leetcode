class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h = new HashMap<>(); 

        for(int x:nums1){
            h.put(x ,1);
        }

        for(int x:nums2){
            if(h.containsKey(x)){
                h.put(x,2);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int x:h.keySet()){
            if(h.get(x)==2){
                list.add(x);
            }
        }

        int[] ans=new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            ans[i]=list.get(i);
        }

        return ans;

    }
}