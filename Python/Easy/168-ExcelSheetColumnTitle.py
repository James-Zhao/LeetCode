class Solution(object):
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = ""
        while(n != 0):
            n = n - 1
            letter = chr(n % 26 + ord('A'))
            s = letter + s
            n = n / 26
        return s
