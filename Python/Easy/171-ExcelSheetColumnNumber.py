class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        total = 0
        for i in range(len(s)):
            total += (ord(s[i]) - 64) * (26**(len(s) - i - 1))
        return total
