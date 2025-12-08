1class Solution {
2    public int countTriples(int n) {
3        Set<Integer> set = new HashSet<>();
4        for(int i = 1;i<=n;i++){
5            set.add(i*i);
6        }
7        int count = 0;
8        for(int a=1;a<=n;a++){
9            for(int b=1;b<=n;b++){
10                int sum = a*a + b*b;
11                if(set.contains(sum)) count++;
12            }
13        }
14        return count;
15    }
16}