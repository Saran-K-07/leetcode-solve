# Last updated: 21/01/2026, 14:43:34
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x = str(x)
        if(x==x[::-1]):
            return True
        else:
            return False
        