class Solution {
    public boolean validString(String s){
        int count = 0;
        for(char c:s.toCharArray()){
            if(c == '('){
                count = count +1;
            } else {
                count = count-1;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }
    public void generateParenthesesHelper(String curr,int n,List<String> res){
        if(curr.length() == 2*n){
            if(validString(curr)){
                res.add(curr);
            }
            return ;
        }
        generateParenthesesHelper(curr + "(" , n , res);
        generateParenthesesHelper(curr + ")" , n , res);

    }   
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesesHelper("", n,res);
        return res;
    }
}