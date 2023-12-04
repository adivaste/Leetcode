class Solution {
    public String largestGoodInteger(String num) {
        for(int i=999; i>=111; i=i-111){
            String query = Integer.toString(i);
            System.out.println(query);
            if (num.contains(query)) return query;
        }
        return (num.contains("000")) ? "000" : "";
    }
}