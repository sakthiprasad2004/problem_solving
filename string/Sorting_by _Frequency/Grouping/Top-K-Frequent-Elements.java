class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int num : nums) mpp.put(num,mpp.getOrDefault(num,0)+1);
        for (Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            System.out.print(entry.getValue()+":"+entry.getKey()+" ");
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b)->{
                if(!a.getValue().equals(b.getValue())){
                    return a.getValue() - b.getValue(); // freq desc
                }
                else return a.getKey()-b.getKey();
            }
        );
        for (Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            pq.offer(entry);
            if(pq.size() > k) pq.poll();

        }
        int[] ans = new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll().getKey();
        }

        return ans;
    }
}