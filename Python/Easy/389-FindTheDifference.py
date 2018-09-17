class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        string = s + t
        result = 0
        for i in string:
            result ^= ord(i)
        return chr(result)