class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.split(" ");
        int plen = pattern.length();
        for(int i=0;i<plen;i++){
            if(plen != arr.length){
                return false;
            }
            char key = pattern.charAt(i);
            String value = arr[i];
            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            }
            else{
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(key,value);
            }
        }
    return true;
    }
}