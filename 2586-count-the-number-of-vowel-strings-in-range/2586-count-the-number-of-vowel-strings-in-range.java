class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while(left <= right){
            char first = words[left].charAt(0);
            char last = words[left].charAt(words[left].length()-1);
            if((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') && (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')){
                count++;
            }
        left++;
        }
    return count;
    }
}