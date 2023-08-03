class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        // Better Optimal
        int size = words.length;
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }

        for(String word : words){
            boolean present = true;
            for(int i=0; i<word.length(); i++){
                if (set.contains(word.charAt(i))) continue;
                else{
                    present = false;
                    break;
                }
            }
            if (present) count++;
        }



        return count;
    }
}