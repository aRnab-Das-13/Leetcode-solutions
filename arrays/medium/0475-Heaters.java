class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        Arrays.sort(heaters);
        for(int house : houses){
            int index = Arrays.binarySearch(heaters, house);

            if(index >= 0){
                continue;
            }
            index = -(index+1);

            int leftDis = Integer.MAX_VALUE;
            int rightDis = Integer.MAX_VALUE;

            if(index > 0){
                leftDis = house - heaters[index -1];
            }
            if(index < heaters.length){
                rightDis = heaters[index] - house;
            }
            int nearest = Math.min(leftDis, rightDis);
            radius = Math.max(radius, nearest);

        }
        return radius;
    }
}