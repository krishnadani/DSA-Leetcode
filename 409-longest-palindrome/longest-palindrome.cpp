class Solution {
public:
    int longestPalindrome(string s) {
     unordered_map<char, int> count;
    for (char c : s) {
        count[c]++;
    }
    int length = 0;
    bool oddFound = false;
    for (auto &p : count) {
        if (p.second % 2 == 0) {
            length += p.second;
        } else {
            length += p.second - 1;
            oddFound = true;
        }
    }
    if (oddFound) length += 1;
    return length;
}
};
