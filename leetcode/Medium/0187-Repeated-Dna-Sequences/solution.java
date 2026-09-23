// LeetCode Problem: Repeated DNA Sequences
// Link: https://leetcode.com/problems/repeated-dna-sequences/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
       
        List<String> ans=new ArrayList<>();
         if( s.length()<10) return ans;

        HashMap<String,Integer> map=new HashMap<>();
        int n=s.length();

        for(int i=0;i<=n-10;i++){

            String sub=s.substring(i,i+10);
            int count=map.getOrDefault(sub,0)+1;
            map.put(sub,count);

            if(count==2) {
                ans.add(sub);
            }
        }

return ans;
    }
}