class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String concatenatedString1 = "";
        for(String s : word1){
            concatenatedString1 += s;
        }

        String concatenatedString2 = "";
        for(String s : word2){
            concatenatedString2 += s;
        }

        return concatenatedString2.equals(concatenatedString1);
    }
}