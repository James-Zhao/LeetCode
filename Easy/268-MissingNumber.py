class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        for i in range(0,len(nums)):
            if (nums[i] != i):
                return i
        return len(nums)
    def missingNumber1(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        return n * (n + 1) / 2 - sum(nums)

    def missingNumber2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        res = len(nums)
        for i in range(n):
            res ^= i
            res ^= nums[i]
        return res



