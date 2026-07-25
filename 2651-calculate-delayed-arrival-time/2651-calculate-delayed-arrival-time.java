class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int total = arrivalTime + delayedTime;
        if(total < 24){
            return total;
        }
    return Math.abs(24 - total); 
    }
}