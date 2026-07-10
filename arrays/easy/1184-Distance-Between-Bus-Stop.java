class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if( start > destination ){
            int temp = start;
            start = destination;
            destination = temp ;
        }
        int path = 0;
        for(int i = start; i < destination; i++){
            path += distance[i];
        }
        int totalDistance = 0;
        for(int x : distance){
            totalDistance += x;
        }
        return Math.min(path, (totalDistance - path));
    }
}