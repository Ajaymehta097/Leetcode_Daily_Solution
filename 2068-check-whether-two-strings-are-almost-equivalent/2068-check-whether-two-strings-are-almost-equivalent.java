class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        for(char ch:w1){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:w2){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        // frequency check in numbers how many of each letter
        for(char ch='a';ch <= 'z';ch++){
            int freq1 = map1.getOrDefault(ch,0);
            int freq2 = map2.getOrDefault(ch,0);
            if(Math.abs(freq1-freq2)>3){
                return false;
            }
        }
    return true;
    }
}