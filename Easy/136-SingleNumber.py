class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = {}
        for i in nums:
            dic[i] = dic.get(i, 0) + 1
        for key, value in dic.items():
            if value == 1:
                return key
    def singleNumber1(self, nums):
        res = 0;
        for i in nums:
            res ^= i
        return res