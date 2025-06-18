class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mpp = new HashMap<>();
        for(String word : words){
            mpp.put(word,mpp.getOrDefault(word,0)+1);
        }
       for(Map.Entry<String,Integer> entry: mpp.entrySet()){
        System.out.print(entry.getKey()+ "->" + entry.getValue()+" ");
       }

       PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
        (a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return a.getValue() - b.getValue(); //freq asc
            }
            else{
                return b.getKey().compareTo(a.getKey()); // word desc
            }
        }
       );

       for(Map.Entry<String,Integer> entry : mpp.entrySet()){
        pq.offer(entry);
        if(pq.size() > k) pq.poll();
       }

       List<String> res = new ArrayList<>();
       while(!pq.isEmpty()){
        res.add(pq.poll().getKey());
       }
       Collections.reverse(res);
       return res;


    
    }
}