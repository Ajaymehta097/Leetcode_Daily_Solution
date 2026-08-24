class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int oper = 0;
        for(String str:operations){
            if(str.equals("--X") || str.equals("X--")){
                oper -= 1;
            }else{
            oper += 1;
            }
        }
    return oper;
    }
}