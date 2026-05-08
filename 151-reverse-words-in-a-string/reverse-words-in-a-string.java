class Solution {
    public String reverseWords(String s) {
        
        s=s.trim();
        String[] arr = s.split("\\s+");

        HashMap<Integer, String> h = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            h.put(i, arr[i]);
        }
        StringBuilder ans = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--) {

            ans.append(h.get(i));

            if(i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}