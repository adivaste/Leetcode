class Solution {
    public int compareVersion(String version1, String version2) {
        
        /* Sub problems
            - Convert to array 
            - Make the lenght of both version same (by appneding 0's')
            - Convert the string to integers (also remove the leading zeros)

            Arrays of same size, with integer as data type   
        */


        String[] version1Revs = version1.split("\\.");
        String[] version2Revs = version2.split("\\.");

        int v1Len = version1Revs.length;
        int v2Len = version2Revs.length;

        int answer = 0;
        int p1 = 0;
        int p2 = 0;

        // convert the version to integer format
        int[] version1Int = new int[v1Len];
        int[] version2Int = new int[v2Len];

        for(int i=0; i<v1Len; i++){
            version1Int[i] = trimZeros(version1Revs[i]);
        }
        for(int i=0; i<v2Len; i++){
            version2Int[i] = trimZeros(version2Revs[i]);
        }

        while(p1 < version1Int.length && p2 < version2Int.length){
            if (version1Int[p1] < version2Int[p2]){
                answer = -1;
                return answer;
            }
            else if (version1Int[p1] > version2Int[p2]){
                answer = 1;
                return answer;
            }
            p1++;
            p2++;
        }

        while(p1 < version1Int.length){
            if (version1Int[p1] > 0){
                answer = 1;
                break;
            }
            p1++;
        }
        while(p2 < version2Int.length){
            if (version2Int[p2] > 0){
                answer = -1;
                break;
            }
            p2++;
        }

        return answer;
    }

    public int trimZeros(String version){
        int firstNonZeroIndex = -1;

        for(int i=0; i<version.length(); i++){
            if(version.charAt(i) != '0'){
                firstNonZeroIndex = i;
                break;
            }
        }

        return firstNonZeroIndex == -1 ? 0 : Integer.valueOf(version.substring(firstNonZeroIndex));
    }
}