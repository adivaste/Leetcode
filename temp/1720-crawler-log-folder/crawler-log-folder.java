class Solution {
    public int minOperations(String[] logs) {
        
        int folderDepth = 0;
        for(int i=0; i<logs.length; i++){
            
            if("../".equals(logs[i])){
                if(folderDepth > 0) folderDepth--;
            }
            else if ("./".equals(logs[i])){
                continue;
            }
            else{
                folderDepth++;
            }
        }

        return folderDepth;
    }
}