class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}
        for i in range(len(nums)):
            if (dict.has_key(target - nums[i])):
                return [dict.get(target-nums[i]), i]
            else:
                dict[nums[i]] = i
