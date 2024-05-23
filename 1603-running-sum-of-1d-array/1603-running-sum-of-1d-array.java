class Solution {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        result[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            int sum=0;
            for(int j=0; j<=i; j++){
                sum=sum+nums[j];
            }
            result[i]=sum;
        }
        return result;
    }
}