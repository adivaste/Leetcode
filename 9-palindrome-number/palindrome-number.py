class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        
        # Negative numbers can never be palindromes
        if x < 0:
            return False
        # reverse the digits of x
        reverse = 0
        temp = x
        while temp != 0:
            reverse = reverse * 10 + temp % 10
            temp /= 10
        # check if x is equal to reverse
        return x == reverse