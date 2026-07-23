class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int mid, low = 0, high = n-1;
        int ans = 0;

        //1, 3, 5

        while(low <= high)//low = 0, high = 2
        {
            mid = (low+high)/2;//mid = 1
            if(nums[mid] == target)//3==3
            {
                ans = mid;
                return ans;
            }

            else if(nums[mid] > target)//3 > 2
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;//low = 1
            }
        }
        return low;
    }
}
