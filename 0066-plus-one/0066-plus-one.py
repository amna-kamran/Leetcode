class Solution(object):
    def plusOne(self, digits):
        integer = int(''.join(map(str,digits)))+1
        integer = str(integer)
        digits =[int (char) for char in integer]
        return digits