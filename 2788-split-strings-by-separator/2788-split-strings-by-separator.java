class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for(String word:words){
            String[] arr = word.split("\\" + separator);
            for(String s:arr){
                if(!s.isEmpty()){
                    ans.add(s);
                }
            }
        }
    return ans;
    }
}