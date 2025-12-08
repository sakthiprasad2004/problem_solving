1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count = 0;
4        int n = arr.length;
5        for(int i=0;i<n-2;i++){
6            for(int j=i+1;j<n-1;j++){
7                for(int k=j+1;k<n;k++){
8                    if(( Math.abs(arr[i] - arr[j]) <= a ) && (Math.abs(arr[j] - arr[k]) <= b )  && (Math.abs(arr[i] - arr[k]) <= c) ) count++;
9                }
10            }
11        }
12        return count;
13    }
14}