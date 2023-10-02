class Solution(object):
    def shuffle(self, nums, n):
        if len(nums) != 2 * n:
            return "Can't calculate"
        
        shuffled = []
        for i in range(n):
            shuffled.append(nums[i])
            shuffled.append(nums[i + n])
        
        return shuffled
