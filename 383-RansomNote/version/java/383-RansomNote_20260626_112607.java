// Last updated: 6/26/2026, 11:26:07 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i=0;i<magazine.length();i++){
5            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
6        }
7        for(int i=0;i<ransomNote.length();i++){
8            if(!map.containsKey(ransomNote.charAt(i))||map.get(ransomNote.charAt(i))==0) return false;
9            map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
10        }
11        return true;
12    }
13}