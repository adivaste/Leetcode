class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        int i=0;
        for(int j=0; j<t.length(); j++){
            if (i == s.length()) return true;
            if (t.charAt(j) == s.charAt(i)){
                i++;
            }
        }

        return i == s.length();
    }
}

/*
s = "abc"
t = "ahbgdc"

i = 0
traverse over string "t"
    check each character matches with s[i]
        move both pointer
    otherwise
        move only j

if i == s.length return true
false


*/