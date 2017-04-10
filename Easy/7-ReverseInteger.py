class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        MAX = 2**31

        if (x >= 0):
            num = int(str(x)[::-1])
            if num > MAX:
                return 0
            return num

        else:
            num = int(str(abs(x))[::-1])
            if num > MAX:
                return 0
            return -1 * num