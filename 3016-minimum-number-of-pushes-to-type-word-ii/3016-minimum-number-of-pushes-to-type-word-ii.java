class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int freq : map.values()){
            list.add(freq);
        }
        Collections.sort(list,Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<list.size();i++){
            ans += list.get(i) * (i/8+1);
        }
    return ans;
    }
}