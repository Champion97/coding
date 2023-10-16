class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character, Integer> mapOne = new HashMap<Character, Integer>();

    if(s.length() != t.length())
    return false;
     for(int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         mapOne.put(ch, mapOne.getOrDefault(ch, 0) + 1);
     }   
//for each character in s string which is in the map, we compare it to each character in string j and decrease the number by 1. If it is less than 1, it means that j string has more occurances of that character than s string.
     for(int j = 0; j < t.length(); j++) {
         char ch = t.charAt(j);
         if(!mapOne.containsKey(ch))
         return false;

         mapOne.put(ch, mapOne.get(ch) -1);

         if(mapOne.get(ch) < 0)
         return false;
         
     }
     return true;
    }
}


