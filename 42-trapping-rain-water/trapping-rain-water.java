class Solution {
    public int trap(int[] height) {
        int rightend = height.length-1,leftend =0 ;
        int lmax = height[leftend], rmax = height[rightend];
        int sum =0;
        while(leftend<rightend){
            if(lmax < rmax){
                leftend++;
                lmax = Math.max(lmax,height[leftend]);
                sum += lmax - height[leftend];
            }
            else{
                rightend--;
                rmax = Math.max(rmax,height[rightend]);
                sum += rmax - height[rightend];
            }
            
        }return sum;
    }
}