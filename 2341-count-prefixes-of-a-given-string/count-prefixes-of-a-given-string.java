import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countPrefixes(String[] words, String s) {
        if (words == null || s == null) {
            return 0;
        }

        int count = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder prefix = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                prefix.append(s.charAt(j));
            }
            set.add(prefix.toString());
        }

        for (String word : words) {
            if (set.contains(word)) {
                count++;
            }
        }

        return count;
    }
}
