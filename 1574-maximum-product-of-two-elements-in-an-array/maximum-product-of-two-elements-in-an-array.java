class Solution {
    public int maxProduct(int[] nums) {
        int firstmax = 0 ,secondmax = 0;
        for(int n:nums){
            if(firstmax<n) {
                secondmax = firstmax;
                firstmax = n;
            }
            else if(secondmax<n && n<=firstmax) secondmax = n;
        }
        System.out.print(firstmax+" "+secondmax);
        return (secondmax-1)*(firstmax-1);
    }
}