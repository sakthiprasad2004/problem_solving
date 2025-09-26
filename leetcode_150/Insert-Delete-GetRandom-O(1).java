class RandomizedSet {
    private List<Integer> list;
    private Map<Integer,Integer> mpp;
    public RandomizedSet() {
        list = new ArrayList<>();
        mpp = new HashMap<>();
    }
    public boolean search(int val){
        return mpp.containsKey(val);
    }
    public boolean insert(int val) {
        if(search(val)) return false;
        list.add(val);
        mpp.put(val,list.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
         if(!search(val)) return false;
         int index = mpp.get(val);
        //  get the index of val
        list.set(index,list.get(list.size()-1));
        mpp.put(list.get(index),index);
        list.remove(list.size()-1);
        
        mpp.remove(val);
        return true;
         
        
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */