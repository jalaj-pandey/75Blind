class Solution {
    public boolean isAnagram(String s, String t) {
        int [] count = new int[26];
        for(char X : s.toCharArray()){
            count[X - 'a']++;
        }
        for(char X : t.toCharArray()){
            count[X - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}