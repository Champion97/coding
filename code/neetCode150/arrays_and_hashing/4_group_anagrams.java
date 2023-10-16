//https://leetcode.com/problems/group-anagrams/submissions/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<String, List<String>>();

        //convert each string into char array, sort it and convert it back to a string
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedstr = new String(charArray);

            groups.putIfAbsent(sortedstr, new ArrayList<>());

            groups.get(sortedstr).add(str);
        }
        List<List<String>> result = new ArrayList<>(groups.values());
        return result;
    }
}
