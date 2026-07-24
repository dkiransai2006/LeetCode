//My Solution (used Built-in Function)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int k = 1, i, ans = 0, min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(i = 0; i<nums.length; i++)
        {
            if(k != nums[i])
            {
                ans = k;
                if(min > k)
                {
                    min = k;
                }
            }
            else
            {
                k = k+1;
            }
        }
        return k;
    }
}
