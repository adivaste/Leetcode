class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morse=new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> map=new HashMap<>();
        for(char i='a';i<='z';i++)
        {
            map.put(i,morse[i-'a']);
        }

        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            String word=words[i];
            for(int j=0;j<word.length();j++)
            {
                char c=word.charAt(j);
                sb.append(map.get(c));
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}