class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        if (len(str(num)) == 1):
            return num
        else:
            n = 0
            for i in str(num):
                n += int(i)
            return self.addDigits(n)
    def addDigits1(self, num):
        if num == 0:
            return 0
        return num % 9 if num % 9 != 0 else 9