class Solution {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        for (int i = 0; i <= s.length(); i++) {
            if (s.startsWith(left, i)) {
                int j = s.indexOf(right, i + left.length());

                if (j != -1) {
                    return true;
                }
            }
        }

        return false;
    }
}