class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
       PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b)->
       Double.compare(b[0],a[0]));
       for(int i=0;i<classes.length;i++){
       double currAvg =(double) classes[i][0] / classes[i][1]; 
       double newAvg = (double) (classes[i][0] + 1) / (classes[i][1]+1);
       double increment = newAvg - currAvg;
       maxHeap.offer(new double[]{increment,i});
    }

    while(extraStudents-- > 0){
        double[] top = maxHeap.poll();
        int indx = (int) top[1];
        classes[indx][0]++;
        classes[indx][1]++;
        double currAvg = (double) classes[indx][0] / classes[indx][1];
        double newAvg = (double) (classes[indx][0] + 1)/(classes[indx][1]+1);
        double increment = newAvg - currAvg;
        maxHeap.offer(new double[]{increment,indx});
    }

    double finalAvg = 0.0;
    for(int[] c : classes){
        finalAvg += (double) c[0] / c[1];
    }
    return (double)finalAvg/classes.length;
}
}