class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        List<Set<Integer>> userlangs = new ArrayList<>();
        for(int i=0;i<m;i++){
            Set<Integer> set = new HashSet<>();
            for(int lang : languages[i]){
                set.add(lang);
            }
            userlangs.add(set);
        }
       
        Set<Integer> problematicUsers = new HashSet<>();
        for(int[] f : friendships){
            int u = f[0] - 1;
            int v = f[1] - 1;
            Set<Integer> langsu = userlangs.get(u);
            Set<Integer> langsv = userlangs.get(v);

            boolean canTalk = false;
            for(int lang : langsu){
                if(langsv.contains(lang)){
                    canTalk = true;
                    break;
                }
            }
            if(!canTalk){
                problematicUsers.add(u);
                problematicUsers.add(v);
            }
        }
         if(problematicUsers.isEmpty()) return 0;
        int ans = Integer.MAX_VALUE;
        for(int lang = 1;lang <= n;lang++){
            int count = 0;
            for(int user : problematicUsers){
                if(userlangs.get(user).contains(lang)) count++;
            }
             ans = Math.min(ans,problematicUsers.size()-count);
        }
        return ans;

    }
}