class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for x in range(len(digits) - 1, -1, -1):
            if (digits[x] < 9):
                digits[x] = digits[x] + 1
                return digits
            digits[x] = 0

        digits[0] = 1
        digits.append(0)
        return digits