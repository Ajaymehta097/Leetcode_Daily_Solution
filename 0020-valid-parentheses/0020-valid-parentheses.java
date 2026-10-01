class Solution {
    public char getVal(char ch){
        switch(ch){
            case ']':return '[';
            case '}':return '{';
            case ')':return '(';
            default:return ' ';
        }
    }
    public boolean isValid(String s) {
        String opening = "({[";
        String closing = ")}]";
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(opening.indexOf(ch) != -1){
                stack.push(ch);
            } else{
                if(stack.size() == 0) return false;
                char tmp = stack.pop();
                if(getVal(ch) != tmp)
                    return false;
            }
        }
        return stack.size() == 0;
    }
}