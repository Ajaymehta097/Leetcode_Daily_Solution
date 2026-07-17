class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] letters = title.split(" ");
        for(String str:letters){
            if(str.length() <= 2){
                str = str.toLowerCase();
                sb.append(str);
                sb.append(" ");
            }else{
                str = str.toLowerCase();
                str = Character.toUpperCase(str.charAt(0))+str.substring(1);
                sb.append(str);
                sb.append(" ");
            }  
        }
        return sb.toString().trim();
    }
}