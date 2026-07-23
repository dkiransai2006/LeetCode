class Solution {
    public boolean isPerfectSquare(int num) {
        boolean ans = false;
        long i;

        for(i = 1; i*i <= num; i++)
        {
            if(i*i == num){
              return true;
            }
        }
        return ans;
    }
}
