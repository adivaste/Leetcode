class Solution {
    public String reversePrefix(String word, char ch) {
        int index = getCharacterIndex(word, ch);

        if (index == -1){
            return word;
        }
        else{
            return reverseSubstring(word, index);
        }
    }

    // Reverse the substring 
    public String reverseSubstring(String word, int end){
        StringBuilder sb = new StringBuilder(word);
        int start = 0;

        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);

            start++;
            end--;
        }

        return sb.toString();
    }

    // Get the index of the character from word
    public int getCharacterIndex(String word, char ch){
        int index = -1;

        for(int i=0; i<word.length(); i++){
            if (word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        return index;
    }
}