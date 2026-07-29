class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int km = 0;
        int used = 0;
        while(mainTank > 0){
            mainTank--;
            used++;
            km += 10;
            if(used%5 == 0 && additionalTank > 0){
                mainTank++;
                additionalTank--;
            }
        }
    return km;
    }
}