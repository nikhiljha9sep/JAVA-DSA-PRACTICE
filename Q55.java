class Solution {
    public boolean canJump(int[] nums) {
 int i=0;
 while(i < nums.length)
 {
    int temp=nums[i];
    if(temp+i >=nums.length-1)
    {
        return true;
    }
    if(temp==0)
    {
        return false;
    }
    i=i+temp;
 }    
return false;
    }
}