# Last updated: 09/02/2026, 12:06:50
1class Solution(object):
2    def twoSum(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        for i in range(len(nums)):
9            for j in range(i+1,len(nums)):
10                if(nums[i]+nums[j]==target):
11                    return [i,j]