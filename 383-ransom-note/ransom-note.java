class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> h = new HashMap<>();

        char []a = ransomNote.toCharArray();
        char []b = magazine.toCharArray();

        for(char c:b){
            h.put(c,h.getOrDefault(c,0)+1);
        }

        for(char c:a){

            if(h.getOrDefault(c,0)==0){
                return false;
            }

            h.put(c,h.get(c)-1);
        }

        return true;

    }
}