class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> h = new HashMap<>();

        for(String word:strs){

          char[] ch = word.toCharArray();

          Arrays.sort(ch);

          String sorted = new String(ch);

          if(!h.containsKey(sorted)){
            h.put(sorted,new ArrayList<>());
          }

          h.get(sorted).add(word);
        }
        return new ArrayList<>(h.values()); 
    }
}