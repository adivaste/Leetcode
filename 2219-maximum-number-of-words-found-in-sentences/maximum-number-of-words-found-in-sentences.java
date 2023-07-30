class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(String sentence : sentences){
            int words = 1;
            for(int i=0; i<sentence.length(); i++){
                if (sentence.charAt(i) == ' ') words++;
            }
            max = Math.max(words, max);
        }

        return max;
    }
}