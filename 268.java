class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i,sum=0,s=0;
        sum=n*(n+1)/2;
        for(i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        return(sum-s);
        
        int xor1=0,xor2=0,i;
        for(i=1;i<=nums.length;i++)
        {
            xor1=xor1^i;
        }
        for(i=0;i<nums.length;i++)
        {
            xor2=xor2^nums[i];
        }
        return(xor1^xor2);
    }
}
