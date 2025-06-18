class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mpp = new TreeMap<>();
        for(char c : s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = 
        new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());

        maxHeap.addAll(mpp.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        
        }
        return sb.toString();

       

    }
}