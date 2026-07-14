class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalanswer=new ArrayList<>();

        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
         for(int num:nums1) set1.add(num);
         for(int num:nums2) set2.add(num);
        List<Integer>first=new ArrayList<>();

        for(int num:set1){
            if(!set2.contains(num)){
                first.add(num);
            }
        }
        List<Integer>sec=new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                sec.add(num);
            }
        }
        finalanswer.add(first);
        finalanswer.add(sec);
        return finalanswer;
        
    }
}