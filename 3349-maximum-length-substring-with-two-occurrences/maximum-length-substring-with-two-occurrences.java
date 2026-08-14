class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int left = 0,max = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            m.put(a,m.getOrDefault(a,0)+1);
            while(m.get(a)>2){
                char l = s.charAt(left);
                m.put(l,m.get(l)-1);
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}