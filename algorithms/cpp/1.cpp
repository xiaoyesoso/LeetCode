/*
leetcode 1.Two sum
        Difficulty:Easy
        Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
        Given nums = [2, 7, 11, 15], target = 9,
        Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. */

//先Map，再查找对应下标

class Solution {
public:
vector<int> twoSum(vector<int>& nums, int target) {
	//初始化Map
    bool vis[nums.size()+1]={false};
    for(int i=0;i<nums.size();i++){
        Hash[nums[i]]=i;
    }
    vector<int> result;
	//查找和为指定数的组合
    for(int i=0;i<nums.size();i++){
        int rs=target-nums[i];
        vis[i]=true;
        if(Hash.find(rs)!=Hash.end()&&Hash[rs]!=i){
            result.push_back(i);
            result.push_back(Hash[rs]);
            return result;
        }
    }
    return result;
    }
}; 
