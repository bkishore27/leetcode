class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s:strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!m.containsKey(key)){
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(s);
        }return new ArrayList<>(m.values());
    }
}