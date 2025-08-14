class Solution {
public:
    void setZeroes(vector<vector<int>> &arr) {
        int n = arr.size();
        int m = arr[0].size();

        vector<bool> row(n, false ), col(m, false);
        for(int i=0; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(row[i] || col[j]){
                    arr[i][j]=0;
                }
            }
        }
    }
};