class Solution {
    public int[] decode(int[] encoded, int first) {
        
        int size = encoded.length;
        int[] decoded = new int[size+1];
        decoded[0] = first;
        
        for(int i=0; i<size; i++){
            int next = encoded[i]^first;
            decoded[i+1] = next;
            first = next;
        }

        return decoded;
    }
}