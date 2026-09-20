class Solution {
    public int reverseBits(int n) {
        int[] arr = new int[32];
        int i=0;
        while(n>0){
            arr[i++] = n%2;
            n/=2;
        }
        int ans = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i] == 1){
                int power = 31-i;
                ans += Math.pow(2,power);
            }
        }
        return ans;
    }
}