class Solution:
    def longestPalindrome(self, s: str) -> str:
        res =""
        left = 0
        right = len(s)-1
        while left < len(s):
            while right >= left:
                if(s[left]==s[right]):
                    substring = s[left : right+1]
                
                    if substring == substring[::-1]:
                        if len(substring) > len(res):
                            res = substring
                
                right-=1
            left +=1
            right =len(s)-1
        return res
        