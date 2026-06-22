class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);long sum = costs[0],c=0;
        if(sum<coins) c=1;
        for(int i=1;i<costs.length;i++){
            sum +=costs[i];
            if(sum<=coins){
                c++;
            }
        }return (int)c;
    }
}