class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap <String, Integer> map1 = new HashMap<>();
        HashMap <String, Integer> map2 = new HashMap<>();
        for(String word:words1){
                map1.put(word,map1.getOrDefault(word,0)+1);
        }   
        for(String word:words2){
                map2.put(word,map2.getOrDefault(word,0)+1);
        }
        for(String word:map1.keySet()){
            if(map2.containsKey(word) && map1.get(word) == 1 && map2.get(word) == 1){
                count += 1; 
            }
        }
        return count;
    }
}