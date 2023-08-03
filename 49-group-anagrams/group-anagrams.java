class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i=0; i<size; i++){
            String temp = strs[i];
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            temp = new String(arr);

            if (map.containsKey(temp)){
                map.get(temp).add(strs[i]);
            }
            else{
                ArrayList<String> s = new ArrayList<>();
                s.add(strs[i]);
                map.put(temp, s);
            }
        }

        List<List<String>> answer = new ArrayList<List<String>>();
        for(List<String> item : map.values()){
            answer.add(item);
        }

        return answer;
    }
}