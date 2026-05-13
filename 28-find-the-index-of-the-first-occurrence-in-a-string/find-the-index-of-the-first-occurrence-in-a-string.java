class Solution {
    public int strStr(String haystack, String needle) {
        char[] a=haystack.toCharArray();
        char[] b=needle.toCharArray();

        int k=needle.length();

        for(int i=0 ; i<=a.length-k ; i++){
            int l=0;
            char[] temp = new char[k];
            for(int j=i ; j<=(i+k)-1 ; j++){
                temp[l]=a[j];
                l++;
            }
            if(Arrays.equals(b,temp)){
                return i;
            }
        }
        return -1;
    }
}