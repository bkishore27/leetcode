class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> s= new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int n = nums2[i];
            while(!s.isEmpty() && s.peek()<=n){
                s.pop();
            }
            m.put(n,s.isEmpty()?-1:s.peek());
            s.push(n);
        }
        int[] a = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=m.get(nums1[i]);
        }
        return a;
    }
}