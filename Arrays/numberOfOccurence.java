/* Problem: Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise. */


class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        HashSet <Integer> set = new HashSet<>();

        for (int freq : map.values()){
            if (set.contains(freq)){
                return false;
                
            }
            set.add(freq);
        }
        return true;
        
    }
}
