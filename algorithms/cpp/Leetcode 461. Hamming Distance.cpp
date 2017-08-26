/*Leetcode 461. Hamming Distance
Difficulty:Easy
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note: 
0 ≤ x, y < 231.
Example: 
Input: x = 1, y = 4
Output: 2
Explanation: 

1 (0 0 0 1) 
4 (0 1 0 0) 

The above arrows point to positions where the corresponding bits are different.*/
//对两数异或，转为二进制后求1位的数目
class Solution {
public:
    int hammingDistance(int x, int y) {
        x^=y;
        vector<int> s;
        while(x!=0){
            s.push_back(x%2);
            x/=2;
        }
        int r=0;
        for(int i=0;i<s.size();i++){
            if(s[i]!=0)
                r++;
        }
        return r;
    }
};
