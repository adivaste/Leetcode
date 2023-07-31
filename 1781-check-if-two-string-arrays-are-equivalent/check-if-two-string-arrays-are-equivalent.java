class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder string1 = new StringBuilder();
        for(String s : word1){
            string1.append(s);
        }

        StringBuilder string2 = new StringBuilder();
        for(String s : word2){
            string2.append(s);
        }

        return string1.toString().equals(string2.toString());
    }
}