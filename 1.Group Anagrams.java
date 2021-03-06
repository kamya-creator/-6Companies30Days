/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.











Code :
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap();
       
        for(String s : strs)
        {
            HashMap<Character,Integer> fmap = new HashMap<>();
            for(int i =0;i<s.length();i++)
            {
                char c = s.charAt(i);
                fmap.put(c, fmap.getOrDefault(c,0)+1);
            }
            
            
            if(bmap.containsKey(fmap) == false)
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                bmap.put(fmap,list);
            }else{
                ArrayList<String> list = bmap.get(fmap);
                list.add(s);
                bmap.put(fmap, list);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(ArrayList<String> str : bmap.values())
        {
            result.add(str);
        }
        return result;
    }
}
