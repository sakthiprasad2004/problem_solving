class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        int sumA = 0,sumB= 0;
        int n = costs.length;
        int[] arr = new int[n];
        int index = 0;
      
        for(int i=0;i<costs.length;i++){
               int a = costs[i][0];
               int b = costs[i][1];
               sumA += a;
               arr[i] = b - a;

        }
        Arrays.sort(arr);
        for(int i=0;i < n/2;i++){
            sumB += arr[i];
        }

        sum = sumA + sumB;
        return sum;
    }
}