class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int maxPairs = 0;
        
        //Iterate through words and insert them into a HashSet
        //At each word, check if you have seen it's reverse
        Set<String> wordSet = new HashSet<>();
        
        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();
            
            //We have seen the reverse here, so we increment a pair has been found
			//contains() check is O(1) runtime
            if(wordSet.contains(reversedWord)) {
                maxPairs++;
            }
            
            //Always add a word that we have run across
            wordSet.add(word);
        }
        
        return maxPairs;
    }
}